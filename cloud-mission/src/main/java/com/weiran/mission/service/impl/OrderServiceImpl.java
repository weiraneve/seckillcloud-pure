package com.weiran.mission.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weiran.common.obj.Result;
import com.weiran.common.pojo.dto.OrderDTO;
import com.weiran.mission.manager.GoodsManager;
import com.weiran.mission.manager.OrderManager;
import com.weiran.mission.mapper.OrderMapper;
import com.weiran.mission.pojo.entity.Goods;
import com.weiran.mission.pojo.entity.Order;
import com.weiran.mission.pojo.vo.OrderDetailVo;
import com.weiran.mission.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderManager orderManager;
    private final GoodsManager goodsManager;
    private final OrderMapper orderMapper;

    @Override
    public Result<List<OrderDetailVo>> getOrderList() {
        List<OrderDetailVo> orderDetailVoList = new ArrayList<>();
        List<Order> orderList = orderManager.list();
        for (Order order : orderList) {
            Goods goods = goodsManager.getById(order.getGoodsId());
            orderDetailVoList.add(OrderDetailVo.builder()
                    .orderId(order.getId())
                    .goodsId(order.getGoodsId())
                    .goodsName(goods.getGoodsName())
                    .createdAt(order.getCreatedAt())
                    .build());
        }
        return Result.success(orderDetailVoList);
    }

    @Override
    public PageInfo<OrderDTO> findByOrders(Integer page, Integer pageSize, Long id) {
        PageHelper.startPage(page, pageSize);
        List<OrderDTO> orderDTOList;
        if (ObjectUtils.isEmpty(id)) {
            orderDTOList = orderMapper.findByOrder();
        } else {
            orderDTOList = orderMapper.findOrderById(id);
        }
        return new PageInfo<>(orderDTOList);
    }

}

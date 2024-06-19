package com.weiran.mission.service;

import com.weiran.common.obj.Result;
import com.weiran.common.pojo.dto.GoodsDTO;

import javax.servlet.http.HttpServletRequest;

public interface SeckillService {

    /**
     * 执行秒杀
     */
    Result<Integer> doSeckill(long goodsId, String path);

    /**
     * 客户端轮询查询是否下单成功
     */
    Result<Long> seckillResult(long goodsId, HttpServletRequest request);

    /**
     * 返回一个唯一的path的id
     */
    Result<String> getSeckillPath(long goodsId);

    /**
     * 修改本地缓存map内容
     */
    void updateSeckillLocalMap(GoodsDTO goodsDTO);
}

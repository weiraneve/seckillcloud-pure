package com.weiran.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * gateway 解决跨域
 */
@Configuration
public class GatewayCorsConfiguration {
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";
    private static final boolean ALLOW_CREDENTIALS = true;
    private static final Long MAX_AGE = 18000L;
    private static final String CORS_PATH_PATTERN = "/**";

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfiguration = createCorsConfiguration();
        UrlBasedCorsConfigurationSource source = createCorsConfigSource(corsConfiguration);
        return new CorsWebFilter(source);
    }

    private CorsConfiguration createCorsConfiguration() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许访问的头信息
        corsConfiguration.addAllowedHeader(ALLOWED_HEADERS);
        // 允许提交请求的方法类型
        corsConfiguration.addAllowedMethod(ALLOWED_METHODS);
        // 使用具体的允许源
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:3001"));
        // 允许cookies跨域
        corsConfiguration.setAllowCredentials(ALLOW_CREDENTIALS);
        // 预检请求的缓存时间（秒）
        corsConfiguration.setMaxAge(MAX_AGE);
        // 配置前端js允许访问的自定义响应头
        corsConfiguration.addExposedHeader(HttpHeaders.ACCEPT);
        return corsConfiguration;
    }

    private UrlBasedCorsConfigurationSource createCorsConfigSource(CorsConfiguration corsConfiguration) {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(CORS_PATH_PATTERN, corsConfiguration);
        return source;
    }
}

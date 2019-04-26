package com.xuanluos.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 认证服务器
 *
 * @author xuanLuos
 * @date 2019/4/26 14:01
 */
@SpringBootApplication
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}

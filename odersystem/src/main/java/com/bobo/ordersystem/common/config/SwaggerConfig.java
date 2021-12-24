package com.bobo.ordersystem.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Administrator
 * @date 2021/12/24 11:03
 * @description WxOrderBackEnd11
 * @className SwaggerConfig.java
 * @motto Talk is cheap. Show me the code.
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    Boolean swaggerEnabled = true;

    @Bean
    public Docket createRestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("Bobo OrderSystem")
                                              .description("Bobo OrderSystem Description")
                                              .version("1.0")
                                              .build();
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo)
                                                   .enable(swaggerEnabled)
                                                   .select()
                                                   .apis(RequestHandlerSelectors.basePackage(
                                                           "com.bobo.ordersystem.controller"))
                                                   .paths(PathSelectors.any())
                                                   .build()
                                                   .pathMapping("/");
    }

}

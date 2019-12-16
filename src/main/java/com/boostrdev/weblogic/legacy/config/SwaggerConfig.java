//package com.boostrdev.weblogic.legacy.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * SwaggerConfig
// */
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	  public Docket createRestApi() {
//	    return new Docket(DocumentationType.SWAGGER_2)
//	            .apiInfo(apiInfo())
//	            .select()
//	            .apis(RequestHandlerSelectors.basePackage("com.boostrdev.weblogic.legacy.web.controller"))
//	            .paths(PathSelectors.any())
//	            .build();
//	  }
//
//  private ApiInfo apiInfo() {
//      return new ApiInfoBuilder()
//          .title("springboot知识笔记")//大标题
//          .description("springboot知识笔记的接口文档")
//          .version("1.0")//版本
//          .build();
//  }
//
//
//}
//

package com.itheima.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
//配置jsp与thymeleaf共存
@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {
    
       @Bean
       public ViewResolver viewResolver() {
           InternalResourceViewResolver resolver = new InternalResourceViewResolver();
           resolver.setPrefix("/WEB-INF/jsp/");
           resolver.setSuffix(".jsp");
           resolver.setViewNames("*");
           resolver.setOrder(2);
           return resolver;
       }

       @Bean
       public ITemplateResolver templateResolver() {
           SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
           templateResolver.setTemplateMode("HTML5");
           templateResolver.setPrefix("/WEB-INF/");
           templateResolver.setSuffix(".html");
           templateResolver.setCharacterEncoding("utf-8");
           templateResolver.setCacheable(false);
           return templateResolver;
       }

       @Bean
       public SpringTemplateEngine templateEngine() {
           SpringTemplateEngine templateEngine = new SpringTemplateEngine();
           templateEngine.setTemplateResolver(templateResolver());
           return templateEngine;
       }

       @Bean
       public ThymeleafViewResolver viewResolverThymeLeaf() {
           ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
           viewResolver.setTemplateEngine(templateEngine());
           viewResolver.setCharacterEncoding("utf-8");
           viewResolver.setViewNames(new String[]{"/*"});
           viewResolver.setOrder(1);
           return viewResolver;
       }

       public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
           configurer.enable();
       }

       public void addResourceHandlers(ResourceHandlerRegistry registry) {
           super.addResourceHandlers(registry);
       }
}
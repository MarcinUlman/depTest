package dev.ulman.deptest.controllers.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class ThymeleafConfiguration {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(true);
        return templateResolver;
    }

    @Bean
    public SpringResourceTemplateResolver cssTemplateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/static/css/");
        templateResolver.setSuffix(".css");
        templateResolver.setTemplateMode(TemplateMode.CSS);
        templateResolver.setCacheable(true);
        return templateResolver;
    }


//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(thymeleafTemplateResolver());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver thymeleafViewResolver() {
//
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//        return viewResolver;
//    }

}

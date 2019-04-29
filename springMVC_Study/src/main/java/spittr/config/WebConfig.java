package spittr.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter {
    /**
     * description: 配置JSP视图解析器
     *
    org.springframework.web.servlet.ViewResolver
     * @return  * @param
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }
   /* @Bean



    *//**
     * description:配置静态资源的处理
     *//*
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        *//**
         * description: 启用转发到"默认"的servlet
         *//*
        configurer.enable();
    }*/
}

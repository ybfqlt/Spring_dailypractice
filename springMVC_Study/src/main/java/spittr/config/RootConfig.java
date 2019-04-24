package spittr.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

@Configuration
@ComponentScan(basePackages={"spittr"},
          excludeFilters={
        @Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)
          })
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter{
        public WebPackage(){
            super(Pattern.compile("spittr/.web"));
        }
    }
}

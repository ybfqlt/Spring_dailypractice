package com3.scopedbeans;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,value=Configuration.class)}) //默认扫描与配置类相同的包
public class ComponentScannedConfig {
}

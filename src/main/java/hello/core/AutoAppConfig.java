package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//SpringbootApplication에 기본적으로 다 있음.
@ComponentScan(
//        basePackages = "hello.core.member", //여기서부터 하위로 뒤짐, 라이브러리같은 거 안뒤짐..
//        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}

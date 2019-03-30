package soundsystem.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CompactiDisc.class, SgtPeppers.class})

public class CDPlayerConfig {
}
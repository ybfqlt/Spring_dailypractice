package soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
    @Bean
    public CDPlayer cdplayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}

package soundsystem.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactiDisc cd;
    @Autowired
    public CDPlayer(CompactiDisc cd){
        this.cd=cd;
        System.out.println("构造器　自动装配");
    }
    public void play(){
        cd.play();
    }
}

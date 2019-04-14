package soundsystem.xmlconfig.properties;

import org.springframework.beans.factory.annotation.Autowired;
import soundsystem.xmlconfig.CompactDisc;
import soundsystem.xmlconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer{
    private CompactDisc compactDisc;
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }
    public void play(){
        compactDisc.play();
    }
}

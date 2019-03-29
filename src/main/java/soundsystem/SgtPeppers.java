package soundsystem;


import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactiDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}

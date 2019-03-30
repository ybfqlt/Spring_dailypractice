package soundsystem.javaconfig;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.autoconfig.CDPlayerConfig;
import soundsystem.autoconfig.CompactiDisc;
import soundsystem.autoconfig.MediaPlayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog ();

    @Autowired
    private MediaPlayer player;
    @Autowired
    private CompactiDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
    @Test
    public void play(){
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +" by The Beatles\n",log.getLog());
    }
}

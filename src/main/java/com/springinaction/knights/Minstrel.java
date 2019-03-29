package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){  //探险之前调用
        stream.println("Fa la la, the knight is so brave!");
    }
    public void singAfterQuest(){   //探险之后调用
        stream.println("Tee hee hee, the brave knight "+"did embark on a quest!");
    }
}

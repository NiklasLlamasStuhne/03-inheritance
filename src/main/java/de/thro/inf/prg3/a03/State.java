package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.Logger;

public abstract class State{

    private int t;
    private int duration;

    public State(int d){
        duration = d;
        t =0;

    }

    public State tick(Cat cat){
        t++;
        if (duration >t) {
            return this;
        }
        return successor(cat);

    }



    public abstract State successor(Cat cat);


}

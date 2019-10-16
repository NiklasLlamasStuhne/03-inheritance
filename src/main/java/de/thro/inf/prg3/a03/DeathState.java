package de.thro.inf.prg3.a03;

public class DeathState extends State{
    public DeathState (int d){
        super(d);
    }

    @Override
    public State successor(Cat cat) {
        return new DeathState(0);
    }
}

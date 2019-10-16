package de.thro.inf.prg3.a03;

public class SleppingState extends State{

    public SleppingState(int d){
        super(d);
    }

    @Override
    public State successor(Cat cat) {
        return new HungryState(5);
    }
}

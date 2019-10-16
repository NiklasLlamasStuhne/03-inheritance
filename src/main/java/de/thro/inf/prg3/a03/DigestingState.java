package de.thro.inf.prg3.a03;

public class DigestingState extends State {

    public DigestingState (int d){
        super (d);
    }

    @Override
    public State successor(Cat cat) {
        return new PlayfulState(5);
    }
}

package fr.sii.bdd.cucumber;

/**
 * Created by ptrouillard on 22/05/2015.
 */
public class Adder {

    private int count=0;

    public Adder(int count) {
        this.count = count;
    }

    public void add(int count) {
        this.count += count;
    }

    public int getCount() {
        return count;
    }
}

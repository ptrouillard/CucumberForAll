package fr.sii.bdd.cucumber;

/**
 * Created by ptrouillard on 22/05/2015.
 */
public class Calculator {

    private double count=0;

    public Calculator(double count) {
        this.count = count;
    }

    public void add(int count) {
        this.count += count;
    }

    public void multiplyBy(double count) {
        this.count *= count;
    }

    public double getCount() {
        return count;
    }

    public int getCountAsInt() {
        return (int)getCount();
    }
}

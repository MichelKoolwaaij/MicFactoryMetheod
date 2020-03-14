package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public abstract class Voertuig {
    protected String label;
    protected String color;
    protected int maxSpeed;

    public String getLabel(){
        return label;
    }

    public abstract void drive();
}

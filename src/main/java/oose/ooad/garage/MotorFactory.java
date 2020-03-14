package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class MotorFactory extends VoertuigFactory {
    @Override
    public Voertuig create() {
        return new Motor();
    }
}

package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class AutoFactory extends VoertuigFactory{
    // Singleton pattern. For demonstration.
    // Benefit: There will be just one instance of this factory.
    // ... while for the MotorFactory there will be an instance per motor.
    private AutoFactory(){};
    public static VoertuigFactory getInstance() {
        if(instance == null) {
            instance = new AutoFactory();
        }

        return instance;
    }

    @Override
    public Voertuig create() {
        return new Auto();
    }
}

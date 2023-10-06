package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public abstract class VoertuigFactory {
    // This line is so we can use the Singleton pattern if we want
    protected static VoertuigFactory instance;

    // The factory method
    // Instead of having to modify the code of this class
    // We add a new subclass, responsible for creating the instance
    // Now we never have to change existing code of the factory

    // Look at the Test how easy it is done.

    public abstract Voertuig create();
}

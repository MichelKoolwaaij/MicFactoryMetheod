package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class OudeFietsFactory extends VoertuigFactory {
    @Override
    public Voertuig create() {
        // OudeFiets does not match our Voertuig specs
        // So we need an adapter
        return new OudeFietsAdapter(new OudeFiets());
    }
}

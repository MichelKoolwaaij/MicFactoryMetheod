package oose.ooad.garage;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
public class OudeFietsAdapter extends Voertuig {
    OudeFiets fiets;
    public OudeFietsAdapter(OudeFiets oudeFiets) {
        super();
        this.fiets = oudeFiets;

    }

    // The OudeFiets class does not contain getLabel
    // so we create it in the adapter
    @Override
    public String getLabel(){
        return "Oude Fiets";
    }

    // The OudeFiets class does not contain drive()
    // So we convert the interface to "kraakEnPiep" to execute the original code
    @Override
    public void drive() {
        fiets.kraakEnPiep();
    }
}

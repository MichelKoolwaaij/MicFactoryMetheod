package oose.ooad.garage;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Michel Koolwaaij on 14-03-20.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GarageTest {
    private Voertuig voertuig;
    private String soort;

    public Voertuig getVoertuig(VoertuigFactory voertuigFactory){
        return voertuigFactory.create();
    }

    @Test
    public void testAuto(){
        voertuig = getVoertuig (AutoFactory.getInstance());
        soort = voertuig.getLabel();

        assertEquals("Auto", soort);
    }

    @Test
    public void testMotor(){
        voertuig = getVoertuig (new MotorFactory());
        soort = voertuig.getLabel();

        assertEquals("Motor", soort);

    }

    // Added a test for adapter pattern

    @Test
    public void testOudeFiets(){
        voertuig = getVoertuig (new OudeFietsFactory());
        soort = voertuig.getLabel();

        assertEquals("Oude Fiets", soort);

    }
}

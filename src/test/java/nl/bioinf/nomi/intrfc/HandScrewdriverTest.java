package nl.bioinf.nomi.intrfc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandScrewdriverTest {

    @Test
    void doScrew() {
        Screwable handScrewdriver = new HandScrewdriver();
        handScrewdriver.doScrew(new Screw(ScrewType.FLATHEAD, (short) 7));
        //((Powerdrill)handScrewdriver).drill();
        Toolbox toolbox = new Toolbox();
        toolbox.addScrewDriver(handScrewdriver);

        Screwable pd = new Powerdrill();
        toolbox.addScrewDriver(pd);
        pd.doScrew(new Screw(ScrewType.TORQUE, (short)21));

        if (pd instanceof  Powerdrill) {
            //((Powerdrill)pd).drill();
            //more readable:
            Powerdrill powerdrill = (Powerdrill)pd;
            powerdrill.drill();
        }

        toolbox.addScrewDriver(new Screwable() {
            @Override
            public void doScrew(Screw theScrew) {
                System.out.println("Mini screwdriver screwing");
            }
        });
    }
}
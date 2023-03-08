import com.auto.baze.TransportasImpl;
import com.auto.tipas.AutomobilisImpl;

public class Main {
    public static void main(String[] args) {

        TransportasImpl t = new TransportasImpl();
        AutomobilisImpl a = new AutomobilisImpl();


        AutomobilisImpl automobilis1 = new AutomobilisImpl("sausumos", true, 1996, "Audi", 2, true);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("oro", true, 2000, "BWM", 2, false);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("vandens", false, 2015, "VW", 5, false);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("oro", false, 2023, "TOYOTA", 3, true);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("sausumos", true, 1985, "Audi", 3, false);


        TransportasImpl transportas1 = new TransportasImpl("sausumos", true, 1996);
        TransportasImpl transportas2 = new TransportasImpl("oro", true, 2005);
        TransportasImpl transportas3 = new TransportasImpl("oro", false, 2023);
        TransportasImpl transportas4 = new TransportasImpl("vandens", false, 2015);
        TransportasImpl transportas5 = new TransportasImpl("sausumos", true, 1985);

        TransportasImpl sarasas[] = {transportas1, transportas2, transportas3, transportas4, transportas5, automobilis1, automobilis2, automobilis3, automobilis4, automobilis5};

        a.lyginiaiAutomobilioMetai(sarasas);

        System.out.println();

        a.audiPliusDviDurys(sarasas);

        a.automobiliaiVaromiElektra(sarasas);

        System.out.println();

        a.seniausiasAutomobilis(sarasas);

    }

}


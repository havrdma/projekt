package gui;

import model.Sklad;
import model.Zbozi;

public class Docasne {
    public static void naplnSklad(Sklad sklad) {
        sklad.pridejZbozi(new Zbozi("Chleba", 20.5f,5));
        sklad.pridejZbozi(new Zbozi("Rohlík", 10.5f,8));
        sklad.pridejZbozi(new Zbozi("Mléko", 30.5f,12));
    }
}

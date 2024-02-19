package presentation;

import metier.IMetier;
import metier.MetierImpl;
import org.example.dao.DaoImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}

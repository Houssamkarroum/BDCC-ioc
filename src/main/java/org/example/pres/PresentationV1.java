package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //injection des dependances par instanciation statique => dyna
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);// injection via constructor
        // injecter cela avec setters comme 1ere solution
        //metier.setDao(dao);
        System.out.println(metier.calculer());

    }
}

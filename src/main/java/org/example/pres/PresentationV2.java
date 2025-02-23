package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //        DaoImpl dao = new DaoImpl();
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();

            System.out.println(dao.getData());
            //        MetierImpl metier = new MetierImpl(dao);// injection via constructor
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            MetierImpl metier = (MetierImpl) cMetier.getConstructor(IDao.class).newInstance(dao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

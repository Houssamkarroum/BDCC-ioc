package org.example.metier;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;

public class MetierImpl implements IMetier {
   private IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
       this.dao = dao;
   }
    @Override
    public double calculer() {
        double data = dao.getData();
        double res = data*10;
        return res;
    }
    // pour injecter dans la var dao un objet d'une class qui implement l'interface IDao
    // 1ere solution avec setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

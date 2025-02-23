package org.example.dao;
// creer par un developeur
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        // example de donne
        System.out.println("Version base de donnees");
        double data = 44;
        return data;
    }
}

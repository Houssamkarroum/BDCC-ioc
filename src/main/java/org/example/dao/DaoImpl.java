package org.example.dao;
import org.springframework.stereotype.Repository;

// creer par un developeur
@Repository("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        // example de donne
        System.out.println("Version base de donnees");
        double data = 44;
        return data;
    }
}

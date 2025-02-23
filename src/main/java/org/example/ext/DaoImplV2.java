package org.example.ext;

import org.example.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("DaoImplV2 getData from web service");
        return Math.random();
    }
}

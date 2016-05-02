package org.learning.services.utils;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by s.zakipour on 04/30/2016.
 */
public class User implements Observer {

    private abstractProduct product;

    public User() {

    }

    @Override
    public void update(Observable o, Object arg)
    {
        product = (abstractProduct) o;
        System.out.println("user set :" + product.isAvailable() );
    }










}

package org.learning.services.utils;


import java.io.Serializable;


/**
 * Created by s.zakipour on 04/30/2016.
 */
public class Dress extends abstractProduct implements Serializable {


    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void setAvailable(boolean available) {

    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public void setId(long id) {

    }
}

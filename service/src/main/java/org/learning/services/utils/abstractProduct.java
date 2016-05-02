package org.learning.services.utils;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by s.zakipour on 04/30/2016.
 */
public abstract class abstractProduct extends Observable implements Product {


    public abstract boolean isAvailable() ;

    public abstract void setAvailable(boolean available);

    public abstract long getId() ;

    public abstract void setId(long id);

    public static final String NAME = "abstractProduct";

    public void addObserver(Observer observer)
    {
        super.addObserver(observer);
    }
    public void deleteObserver(Observer observer)
    {
        super.deleteObserver(observer);
    }
    public void notifyObservers()
    {
        super.setChanged();
        super.notifyObservers();

    }
}

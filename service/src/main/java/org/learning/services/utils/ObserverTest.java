package org.learning.services.utils;

import org.junit.Test;

/**
 * Created by s.zakipour on 04/30/2016.
 */
public class ObserverTest {



    public static void main(String[] args)
    {
        Dress d = new Dress();
        User usr1 = new User();
        d.addObserver(usr1);

        d.setAvailable(true);
        d.setAvailable(false);








    }
}

package org.learning.services.service;

/**
 * Created by s.zakipour on 04/26/2016.
 */
public final class ServiceFactory {



    public static AbstractMessagingService getFactory(String factoryType)
    {

        switch (factoryType)
        {
            case JAXRPCServiceFactory.JAXRPC_SERVICE_FACTORY : return new JAXRPCServiceFactory();
            case RESTServiceFactory.REST_SERVICE_FACTORY : return new RESTServiceFactory();
        }
        return null;

    }


}

package org.learning.services.service;

/**
 * Created by s.zakipour on 04/26/2016.
 */
public class JAXRPCServiceFactory implements AbstractMessagingService{

    public static final String JAXRPC_SERVICE_FACTORY = "JAXRPCServiceFactory";

    @Override
    public Service getMessagingService(String serviceType) {
        switch (serviceType)
        {
            case JAXRPCMessagingService.JAXRPC_MESSAGING_SERVICE : return new JAXRPCMessagingService();

        }
        return  null;
    }
}

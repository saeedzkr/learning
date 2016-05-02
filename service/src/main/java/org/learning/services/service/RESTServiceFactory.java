package org.learning.services.service;

/**
 * Created by s.zakipour on 04/26/2016.
 */
public class RESTServiceFactory implements AbstractMessagingService {

    public static final String REST_SERVICE_FACTORY = "RESTServiceFactory";

    @Override
    public Service getMessagingService(String serviceType)
    {

        switch (serviceType)
        {
            case RESTMessagingService.REST_MESSAGING_SERVICE : return new RESTMessagingService();

        }
        return  null;

    }
}

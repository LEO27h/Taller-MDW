
package com.nequi.los601.ejb.factory;

import com.nequi.los601.ejb.service.ServiceBean;

public interface IFactory {

    /**
     * Mapeo de service bean a generar por la fabrica.
     * 
     * @param region
     * @param version
     * @return {@code ServiceBean}
     */
    public ServiceBean getServiceBean(String region, String version);

}

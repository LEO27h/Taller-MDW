
package com.nequi.los601.ejb.factory.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.nequi.los601.ejb.factory.getloantypelist.COGetLoanTypeListFactory;
import com.nequi.los601.ejb.service.ServiceBean;
import com.nequi.los601.ejb.util.ConstantLOS601;
import com.nequi.los601.ejb.factory.IFactory;

/**
 * Session Bean implementation class GetLoanTypeListFactory
 */
@Singleton(mappedName = ConstantLOS601.COMMON_STRING_GETLOANTYPELIST_FACTORY)
@LocalBean
public class GetLoanTypeListFactory implements IFactory{

    @EJB(beanName = ConstantLOS601.COMMON_STRING_CO_GETLOANTYPELIST_FACTORY)
    private COGetLoanTypeListFactory factory;

    /**
     * Mapeo de service bean a generar por la fabrica.
     * 
     * @param region
     * @param version
     * @return {@link ServiceBean}
     */
    @Override
    public ServiceBean getServiceBean(String region, String version) {
        ServiceBean bean = null;

        switch (region) {
        case ConstantLOS601.COMMON_STRING_REGION_COLOMBIA:
            bean = factory.buildServiceBean(version);
            break;
        case ConstantLOS601.COMMON_STRING_REGION_PANAMA:
            bean = null;
            break;
        default:
            bean = factory.buildServiceBean(version);
            break;
        }
        return bean;
    }
}

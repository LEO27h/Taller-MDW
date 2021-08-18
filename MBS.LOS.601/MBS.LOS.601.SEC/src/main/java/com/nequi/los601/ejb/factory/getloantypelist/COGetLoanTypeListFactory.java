
package com.nequi.los601.ejb.factory.getloantypelist;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.nequi.los601.ejb.service.ServiceBean;
import com.nequi.los601.ejb.util.ConstantLOS601;

/**
 * Session Bean implementation class COGetLoanTypeListFactory
 */
@Singleton(mappedName =  ConstantLOS601.COMMON_STRING_CO_GETLOANTYPELIST_FACTORY)
@LocalBean
public class COGetLoanTypeListFactory {

    @EJB(beanName = ConstantLOS601.COMMON_STRING_COGETLOANTYPELIST_SERVICE_SEIYA)
    private ServiceBean serviceBeanSeiya;

    public ServiceBean buildServiceBean(String version) {
        switch (String.valueOf(version)) {
        case ConstantLOS601.COMMON_STRING_SEIYA:
            return serviceBeanSeiya;
        case ConstantLOS601.COMMON_STRING_IKKI:
            return null;
        case ConstantLOS601.COMMON_STRING_HYOGA:
            return null;
        default:
            return serviceBeanSeiya;
        }
    }
}

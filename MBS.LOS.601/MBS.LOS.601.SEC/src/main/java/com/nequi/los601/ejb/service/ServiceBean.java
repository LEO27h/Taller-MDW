/**
 * 
 */
package com.nequi.los601.ejb.service;

import javax.ejb.Local;
import javax.ws.rs.core.HttpHeaders;

import com.nequi.los601.ejb.exception.LOS601Exception;

@Local
public interface ServiceBean {

    /**
     * Metodo que expone la operacion principal del servicio.
     * 
     * @param httpHeaders
     * @param request
     * @return respuesta del servicio en formato JSON.
     * @throws LOS601Exception
     */
    public String executeOperation(HttpHeaders httpHeaders, String request) throws LOS601Exception;

}

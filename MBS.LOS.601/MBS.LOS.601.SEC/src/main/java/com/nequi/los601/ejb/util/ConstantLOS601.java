/**
 * 
 */
package com.nequi.los601.ejb.util;


/**
 *Clase para Constantes
 */
public final class ConstantLOS601 {

    // PARAMETROS GENERALES
    public static final String COMMON_STRING_SEIYA = "1.0.0";
    public static final String COMMON_STRING_IKKI = "1.1.0";
    public static final String COMMON_STRING_HYOGA = "1.2.0";
    public static final String COMMON_STRING_REGION_COLOMBIA = "C001";
    public static final String COMMON_STRING_REGION_PANAMA = "P001";
    public static final String COMMON_STRING_RESPONSE_MESSAGE = "responseMessage";
    public static final String COMMON_STRING_REQUEST_MESSAGE = "requestMessage";
    public static final String COMMON_STRING_BODY = "body";
    public static final String COMMON_STRING_SPLIT_PATTERN = "\\.";
    public static final String COMMON_STRING_PATH_BODY_RS = "responseMessage.body";
    public static final String COMMON_STRING_PATH_BODY_RQ = "requestMessage.body";

    // ServiceName
    public static final String COMMON_STRING_SERVICE_ID = "MBS_LOS_601";
    public static final String COMMON_STRING_SERVICE_NAME = "MBS_LoanServices_601";
    public static final String COMMON_STRING_GETLOANTYPELIST_FACTORY = "GetLoanTypeListFactory";
    public static final String COMMON_STRING_CO_GETLOANTYPELIST_FACTORY = "COGetLoanTypeListFactory";
    public static final String COMMON_STRING_COGETLOANTYPELIST_SERVICE_SEIYA = "COGetLoanTypeListServiceSeiya";

    // Facade
    public static final String FACADE_LOAN_SERVICES_PATH = "services/Loan";
    public static final String SERVICE_OPERATION_GETLOANTYPELIST= "getLoanTypeList";
    
    // Prefixes phone number
    public static final String COMMON_STRING_PREFIX_PHONENUMBER_CO = "+57";
    public static final String COMMON_STRING_PREFIX_PHONENUMBER_PA = "+507";
    
    // To validate Finacle client status
    public static final String NAME_CUSTOMER_DETAILS = "CustomerDetails";
    public static final String NAMESPACE_CUSTOMER_DETAILS = "http://co.bancaDigital/nequi/services/UserServices/CustomerDetails/v1.0";
    public static final String OPERATION_GET_CUSTOMER_STATUS = "getCustomerStatus";
    public static final String GET_CUSTOMER_STATUS_RQ = "getCustomerStatusRQ";
    public static final String GET_CUSTOMER_STATUS_RS = "getCustomerStatusRS";
    
    public static final String COMMON_STRING_STATUS_A = "A";

    public static final String SERVICE_OPERATION_APIGATEWAY_GET_PRODUCT = "getProduct";
    public static final String COMMON_STRING_LOAN_SERVICES = "LoanServices";
    
    public static final String PRODUCT_ID_1 = "1";
    public static final String ERROR_MESSAGE_GET_PRODUCT = "Error message get product";
    public static final String ERROR_MESSAGE_PRODUCT = "Error message product";
    
    private ConstantLOS601() {
    }

}

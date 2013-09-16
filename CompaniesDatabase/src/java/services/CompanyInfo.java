/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author vahid
 */
import helper.XmlTarnsform;

@WebService()
public class CompanyInfo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCompanyInfo")
    public String getCompanyInfo(@WebParam(name = "companyname")
    String personname) {
        return XmlTarnsform.xmlFile2String("C:\\Documents and Settings\\vahid\\My Documents\\NetBeansProjects\\CompaniesDatabase\\src\\java\\xml\\Company.xml");
    }

}

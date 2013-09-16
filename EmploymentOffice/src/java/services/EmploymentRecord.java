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
public class EmploymentRecord {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmploymentRecord")
    public String getEmploymentRecord(@WebParam(name = "personname")
    String personname) {

        return XmlTarnsform.xmlFile2String("xml/employment.xml");
    }

}

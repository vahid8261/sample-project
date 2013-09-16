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
@WebService()
public class JobDescription {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getJobs")
    public String getJobs(@WebParam(name = "criteria")
    String criteria) {
        //TODO write your implementation code here:
        return "JobsXML";
    }

}

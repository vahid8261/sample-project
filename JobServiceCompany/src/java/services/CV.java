/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import university.*;
import employment.*;
import companies.*;
import jobdescription.*;
import SAX.SampleSAXParser;;
/**
 *
 * @author vahid
 */
@WebService()
public class CV {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "uploadCV")
    public String uploadCV(@WebParam(name = "CVXML")
    String CVXML) {

        /////////////////////////////////////////////////////////////
        TranscriptService tservice = new TranscriptService();
        Transcript trans = tservice.getTranscriptPort();
        String transcript = trans.getTranscript("reza");

        /////////////////////////////////////////////////////////////
        EmploymentRecordService eservice = new EmploymentRecordService();
        EmploymentRecord erecord = eservice.getEmploymentRecordPort();
        String employmentrecord = erecord.getEmploymentRecord("reza");

        /////////////////////////////////////////////////////////////
        CompanyInfoService cservice = new CompanyInfoService();
        CompanyInfo comp = cservice.getCompanyInfoPort();
        String company = comp.getCompanyInfo("cpd");

        /////////////////////////////////////////////////////////////
        JobDescriptionService jservice = new JobDescriptionService();
        jobdescription.JobDescription jdesc = jservice.getJobDescriptionPort();
        String jobs = jdesc.getJobs("criteria");

        /////////////////////////////////////////////////////////////
        SampleSAXParser parser = new SampleSAXParser();
        return parser.GenerateXmlFile(company, CVXML, employmentrecord, transcript);

        //return "ProfileXML=" + CVXML + transcript + employmentrecord + company + jobs;
    }

}

package pt.upa.transporter.ws.cli;

import java.util.List;

import javax.jws.WebService;

import pt.upa.transporter.ws.BadJobFault_Exception;
import pt.upa.transporter.ws.BadLocationFault_Exception;
import pt.upa.transporter.ws.BadPriceFault_Exception;
import pt.upa.transporter.ws.JobView;
import pt.upa.transporter.ws.TransporterPortType;

@WebService(
	    endpointInterface="pt.upa.transporter.ws.TransporterPortType",
	    wsdlLocation="transporter.1_0.wsdl",
	    name="UpaTransporter",
	    portName="TransporterPort",
	    targetNamespace="http://ws.transporter.upa.pt/",
	    serviceName="TransporterService"
)

public class TransporterClient implements TransporterPortType {

	@Override
	public String ping(String name) {
		//Auto-generated method stub
		return null;
	}

	@Override
	public JobView requestJob(String origin, String destination, int price)
			throws BadLocationFault_Exception, BadPriceFault_Exception {
		//Auto-generated method stub
		return null;
	}

	@Override
	public JobView decideJob(String id, boolean accept) throws BadJobFault_Exception {
		//Auto-generated method stub
		return null;
	}

	@Override
	public JobView jobStatus(String id) {
		//Auto-generated method stub
		return null;
	}

	@Override
	public List<JobView> listJobs() {
		//Auto-generated method stub
		return null;
	}

	@Override
	public void clearJobs() {
		//Auto-generated method stub
		
	}

	

}

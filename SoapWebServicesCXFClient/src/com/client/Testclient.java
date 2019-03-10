/**
 * 
 */
package com.client;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;

import org.apache.xmlbeans.XmlObject;

import com.soap.Employee;
import com.soap.EmployeeDetailsWS_PortType;
import com.soap.EmployeeDetailsWS_ServiceLocator;

/**
 * @author Gopi Krishna
 *
 */
public class Testclient {

	/**
	 * @param args
	 * @throws ServiceException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		EmployeeDetailsWS_ServiceLocator locator=new EmployeeDetailsWS_ServiceLocator();
		EmployeeDetailsWS_PortType porttype=locator.getEmployeeDetailsWSPort();
		Employee emp=porttype.getEmpDetails(6, 7);
		System.out.println(emp.getEmpId()+"   "+emp.getSalary());
		EmployeeDetailsWS_ServiceLocator locator1=new EmployeeDetailsWS_ServiceLocator();
		EmployeeDetailsWS_PortType porttype1=locator1.getEmployeeDetailsWSPort();
		
		XmlObject rtrn = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			OutputStream os = new ByteArrayOutputStream();
			jaxbMarshaller.marshal(emp, os);
			rtrn = XmlObject.Factory.parse(os.toString());
			Employee emp1=porttype1.getXmlElement(rtrn.toString());
			
			
			System.out.println("xml"+rtrn.toString()+"---------"+porttype1.getXmlElement(rtrn.toString()).getEmpName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
	}

}

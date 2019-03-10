package com.soap;

public class EmployeeDetailsWSProxy implements com.soap.EmployeeDetailsWS_PortType {
  private String _endpoint = null;
  private com.soap.EmployeeDetailsWS_PortType employeeDetailsWS_PortType = null;
  
  public EmployeeDetailsWSProxy() {
    _initEmployeeDetailsWSProxy();
  }
  
  public EmployeeDetailsWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeDetailsWSProxy();
  }
  
  private void _initEmployeeDetailsWSProxy() {
    try {
      employeeDetailsWS_PortType = (new com.soap.EmployeeDetailsWS_ServiceLocator()).getEmployeeDetailsWSPort();
      if (employeeDetailsWS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeDetailsWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeDetailsWS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeDetailsWS_PortType != null)
      ((javax.xml.rpc.Stub)employeeDetailsWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soap.EmployeeDetailsWS_PortType getEmployeeDetailsWS_PortType() {
    if (employeeDetailsWS_PortType == null)
      _initEmployeeDetailsWSProxy();
    return employeeDetailsWS_PortType;
  }
  
  public com.soap.Employee getEmpDetails(int arg0, int arg1) throws java.rmi.RemoteException{
    if (employeeDetailsWS_PortType == null)
      _initEmployeeDetailsWSProxy();
    return employeeDetailsWS_PortType.getEmpDetails(arg0, arg1);
  }
  
  public com.soap.Employee getXmlElement(java.lang.String arg0) throws java.rmi.RemoteException{
    if (employeeDetailsWS_PortType == null)
      _initEmployeeDetailsWSProxy();
    return employeeDetailsWS_PortType.getXmlElement(arg0);
  }
  
  
}
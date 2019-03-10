/**
 * EmployeeDetailsWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap;

public class EmployeeDetailsWS_ServiceLocator extends org.apache.axis.client.Service implements com.soap.EmployeeDetailsWS_Service {

    public EmployeeDetailsWS_ServiceLocator() {
    }


    public EmployeeDetailsWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeDetailsWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeDetailsWSPort
    private java.lang.String EmployeeDetailsWSPort_address = "http://192.168.1.28:8090/SoapWebServicesCXF/services/EmployeeDetailsWSPort";

    public java.lang.String getEmployeeDetailsWSPortAddress() {
        return EmployeeDetailsWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeDetailsWSPortWSDDServiceName = "EmployeeDetailsWSPort";

    public java.lang.String getEmployeeDetailsWSPortWSDDServiceName() {
        return EmployeeDetailsWSPortWSDDServiceName;
    }

    public void setEmployeeDetailsWSPortWSDDServiceName(java.lang.String name) {
        EmployeeDetailsWSPortWSDDServiceName = name;
    }

    public com.soap.EmployeeDetailsWS_PortType getEmployeeDetailsWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeDetailsWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeDetailsWSPort(endpoint);
    }

    public com.soap.EmployeeDetailsWS_PortType getEmployeeDetailsWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soap.EmployeeDetailsWSSoapBindingStub _stub = new com.soap.EmployeeDetailsWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeDetailsWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeDetailsWSPortEndpointAddress(java.lang.String address) {
        EmployeeDetailsWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soap.EmployeeDetailsWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soap.EmployeeDetailsWSSoapBindingStub _stub = new com.soap.EmployeeDetailsWSSoapBindingStub(new java.net.URL(EmployeeDetailsWSPort_address), this);
                _stub.setPortName(getEmployeeDetailsWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployeeDetailsWSPort".equals(inputPortName)) {
            return getEmployeeDetailsWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.com/", "EmployeeDetailsWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.com/", "EmployeeDetailsWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeDetailsWSPort".equals(portName)) {
            setEmployeeDetailsWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

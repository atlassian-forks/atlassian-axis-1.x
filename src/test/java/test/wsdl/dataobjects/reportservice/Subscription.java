/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class Subscription  implements java.io.Serializable {
    private java.lang.String subscriptionID;

    private java.lang.String owner;

    private java.lang.String path;

    private java.lang.String virtualPath;

    private java.lang.String report;

    private test.wsdl.dataobjects.reportservice.ExtensionSettings deliverySettings;

    private java.lang.String description;

    private java.lang.String status;

    private test.wsdl.dataobjects.reportservice.ActiveState active;

    private java.util.Calendar lastExecuted;

    private java.lang.String modifiedBy;

    private java.util.Calendar modifiedDate;

    private java.lang.String eventType;

    private boolean isDataDriven;

    public Subscription() {
    }

    public Subscription(
           java.lang.String subscriptionID,
           java.lang.String owner,
           java.lang.String path,
           java.lang.String virtualPath,
           java.lang.String report,
           test.wsdl.dataobjects.reportservice.ExtensionSettings deliverySettings,
           java.lang.String description,
           java.lang.String status,
           test.wsdl.dataobjects.reportservice.ActiveState active,
           java.util.Calendar lastExecuted,
           java.lang.String modifiedBy,
           java.util.Calendar modifiedDate,
           java.lang.String eventType,
           boolean isDataDriven) {
           this.subscriptionID = subscriptionID;
           this.owner = owner;
           this.path = path;
           this.virtualPath = virtualPath;
           this.report = report;
           this.deliverySettings = deliverySettings;
           this.description = description;
           this.status = status;
           this.active = active;
           this.lastExecuted = lastExecuted;
           this.modifiedBy = modifiedBy;
           this.modifiedDate = modifiedDate;
           this.eventType = eventType;
           this.isDataDriven = isDataDriven;
    }


    /**
     * Gets the subscriptionID value for this Subscription.
     * 
     * @return subscriptionID
     */
    public java.lang.String getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this Subscription.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(java.lang.String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the owner value for this Subscription.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Subscription.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the path value for this Subscription.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this Subscription.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the virtualPath value for this Subscription.
     * 
     * @return virtualPath
     */
    public java.lang.String getVirtualPath() {
        return virtualPath;
    }


    /**
     * Sets the virtualPath value for this Subscription.
     * 
     * @param virtualPath
     */
    public void setVirtualPath(java.lang.String virtualPath) {
        this.virtualPath = virtualPath;
    }


    /**
     * Gets the report value for this Subscription.
     * 
     * @return report
     */
    public java.lang.String getReport() {
        return report;
    }


    /**
     * Sets the report value for this Subscription.
     * 
     * @param report
     */
    public void setReport(java.lang.String report) {
        this.report = report;
    }


    /**
     * Gets the deliverySettings value for this Subscription.
     * 
     * @return deliverySettings
     */
    public test.wsdl.dataobjects.reportservice.ExtensionSettings getDeliverySettings() {
        return deliverySettings;
    }


    /**
     * Sets the deliverySettings value for this Subscription.
     * 
     * @param deliverySettings
     */
    public void setDeliverySettings(test.wsdl.dataobjects.reportservice.ExtensionSettings deliverySettings) {
        this.deliverySettings = deliverySettings;
    }


    /**
     * Gets the description value for this Subscription.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Subscription.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this Subscription.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscription.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the active value for this Subscription.
     * 
     * @return active
     */
    public test.wsdl.dataobjects.reportservice.ActiveState getActive() {
        return active;
    }


    /**
     * Sets the active value for this Subscription.
     * 
     * @param active
     */
    public void setActive(test.wsdl.dataobjects.reportservice.ActiveState active) {
        this.active = active;
    }


    /**
     * Gets the lastExecuted value for this Subscription.
     * 
     * @return lastExecuted
     */
    public java.util.Calendar getLastExecuted() {
        return lastExecuted;
    }


    /**
     * Sets the lastExecuted value for this Subscription.
     * 
     * @param lastExecuted
     */
    public void setLastExecuted(java.util.Calendar lastExecuted) {
        this.lastExecuted = lastExecuted;
    }


    /**
     * Gets the modifiedBy value for this Subscription.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this Subscription.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedDate value for this Subscription.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Subscription.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the eventType value for this Subscription.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this Subscription.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the isDataDriven value for this Subscription.
     * 
     * @return isDataDriven
     */
    public boolean isIsDataDriven() {
        return isDataDriven;
    }


    /**
     * Sets the isDataDriven value for this Subscription.
     * 
     * @param isDataDriven
     */
    public void setIsDataDriven(boolean isDataDriven) {
        this.isDataDriven = isDataDriven;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptionID==null && other.getSubscriptionID()==null) || 
             (this.subscriptionID!=null &&
              this.subscriptionID.equals(other.getSubscriptionID()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.virtualPath==null && other.getVirtualPath()==null) || 
             (this.virtualPath!=null &&
              this.virtualPath.equals(other.getVirtualPath()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport()))) &&
            ((this.deliverySettings==null && other.getDeliverySettings()==null) || 
             (this.deliverySettings!=null &&
              this.deliverySettings.equals(other.getDeliverySettings()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.lastExecuted==null && other.getLastExecuted()==null) || 
             (this.lastExecuted!=null &&
              this.lastExecuted.equals(other.getLastExecuted()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            this.isDataDriven == other.isIsDataDriven();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSubscriptionID() != null) {
            _hashCode += getSubscriptionID().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getVirtualPath() != null) {
            _hashCode += getVirtualPath().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        if (getDeliverySettings() != null) {
            _hashCode += getDeliverySettings().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getLastExecuted() != null) {
            _hashCode += getLastExecuted().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        _hashCode += (isIsDataDriven() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SubscriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "VirtualPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DeliverySettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ExtensionSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ActiveState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastExecuted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "LastExecuted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "EventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDataDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "IsDataDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

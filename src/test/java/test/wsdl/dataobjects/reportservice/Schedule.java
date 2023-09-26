/**
 * Schedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class Schedule  implements java.io.Serializable {
    private java.lang.String scheduleID;

    private java.lang.String name;

    private test.wsdl.dataobjects.reportservice.ScheduleDefinition definition;

    private java.lang.String description;

    private java.lang.String creator;

    private java.util.Calendar nextRunTime;

    private java.util.Calendar lastRunTime;

    private boolean referencesPresent;

    private test.wsdl.dataobjects.reportservice.ScheduleStateEnum state;

    public Schedule() {
    }

    public Schedule(
           java.lang.String scheduleID,
           java.lang.String name,
           test.wsdl.dataobjects.reportservice.ScheduleDefinition definition,
           java.lang.String description,
           java.lang.String creator,
           java.util.Calendar nextRunTime,
           java.util.Calendar lastRunTime,
           boolean referencesPresent,
           test.wsdl.dataobjects.reportservice.ScheduleStateEnum state) {
           this.scheduleID = scheduleID;
           this.name = name;
           this.definition = definition;
           this.description = description;
           this.creator = creator;
           this.nextRunTime = nextRunTime;
           this.lastRunTime = lastRunTime;
           this.referencesPresent = referencesPresent;
           this.state = state;
    }


    /**
     * Gets the scheduleID value for this Schedule.
     * 
     * @return scheduleID
     */
    public java.lang.String getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this Schedule.
     * 
     * @param scheduleID
     */
    public void setScheduleID(java.lang.String scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the name value for this Schedule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Schedule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the definition value for this Schedule.
     * 
     * @return definition
     */
    public test.wsdl.dataobjects.reportservice.ScheduleDefinition getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this Schedule.
     * 
     * @param definition
     */
    public void setDefinition(test.wsdl.dataobjects.reportservice.ScheduleDefinition definition) {
        this.definition = definition;
    }


    /**
     * Gets the description value for this Schedule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Schedule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creator value for this Schedule.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this Schedule.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the nextRunTime value for this Schedule.
     * 
     * @return nextRunTime
     */
    public java.util.Calendar getNextRunTime() {
        return nextRunTime;
    }


    /**
     * Sets the nextRunTime value for this Schedule.
     * 
     * @param nextRunTime
     */
    public void setNextRunTime(java.util.Calendar nextRunTime) {
        this.nextRunTime = nextRunTime;
    }


    /**
     * Gets the lastRunTime value for this Schedule.
     * 
     * @return lastRunTime
     */
    public java.util.Calendar getLastRunTime() {
        return lastRunTime;
    }


    /**
     * Sets the lastRunTime value for this Schedule.
     * 
     * @param lastRunTime
     */
    public void setLastRunTime(java.util.Calendar lastRunTime) {
        this.lastRunTime = lastRunTime;
    }


    /**
     * Gets the referencesPresent value for this Schedule.
     * 
     * @return referencesPresent
     */
    public boolean isReferencesPresent() {
        return referencesPresent;
    }


    /**
     * Sets the referencesPresent value for this Schedule.
     * 
     * @param referencesPresent
     */
    public void setReferencesPresent(boolean referencesPresent) {
        this.referencesPresent = referencesPresent;
    }


    /**
     * Gets the state value for this Schedule.
     * 
     * @return state
     */
    public test.wsdl.dataobjects.reportservice.ScheduleStateEnum getState() {
        return state;
    }


    /**
     * Sets the state value for this Schedule.
     * 
     * @param state
     */
    public void setState(test.wsdl.dataobjects.reportservice.ScheduleStateEnum state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Schedule)) return false;
        Schedule other = (Schedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              this.definition.equals(other.getDefinition()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.nextRunTime==null && other.getNextRunTime()==null) || 
             (this.nextRunTime!=null &&
              this.nextRunTime.equals(other.getNextRunTime()))) &&
            ((this.lastRunTime==null && other.getLastRunTime()==null) || 
             (this.lastRunTime!=null &&
              this.lastRunTime.equals(other.getLastRunTime()))) &&
            this.referencesPresent == other.isReferencesPresent() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDefinition() != null) {
            _hashCode += getDefinition().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getNextRunTime() != null) {
            _hashCode += getNextRunTime().hashCode();
        }
        if (getLastRunTime() != null) {
            _hashCode += getLastRunTime().hashCode();
        }
        _hashCode += (isReferencesPresent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Schedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Schedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleDefinition"));
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
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "NextRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "LastRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencesPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReferencesPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleStateEnum"));
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

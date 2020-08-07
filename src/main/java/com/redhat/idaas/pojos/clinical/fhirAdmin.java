/**
 * 
 */
package com.redhat.idaas.pojos.clinical;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the Medication module 
 * and the admin context of FHIR. It has been augmented to support additional needed attributes. 
 * It can also be further augmented to support additional needs.
 *
 *
 */
public class fhirAdmin {

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
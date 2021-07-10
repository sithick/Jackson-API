package com.sithick.test;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.sithick.bean.*;
import com.sithick.helper.JsonUtil;
public class Main {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, JAXBException {
		Employee emp = new Employee("Vasu",1132,36000.00);
		emp.setAddress(new EmployeeAddress("19/1", "NGK Nagar", "Chennai", 654789, "TN"));
		String jsonString = JsonUtil.javaObjToJson(emp);
		System.out.println(jsonString);
		System.out.println("----------------------------");
		Employee objEmployee = JsonUtil.jsonToJavaObj(jsonString, Employee.class);
		System.out.println(objEmployee);
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(emp, System.out);
		File file = new File("C:\\Users\\Abubakkar Sithick.G\\eclipse-EE-workspace\\JaksonAPI\\MyFiles\\MyXml.xml");
		marshaller.marshal(emp, file);
		/*
		 * StringWriter writer = new StringWriter(); marshaller.marshal(emp,writer);
		 * String xmlString = writer.toString(); System.out.println(xmlString);
		 */
		System.out.println();
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee obj = (Employee) unmarshaller.unmarshal(file);
		System.out.println(obj);
		
	}

}

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Person.java
//  @ Date : 4/1/2009
//  @ Author : 
//
//

package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import org.simpleframework.xml.Attribute;

public class Person
{
	/* Attributes */
	@Attribute(name = "personName", required = true)
	private String _name = "";

	@Attribute(name = "personID", required = true)
	private String _id = "";

	@Attribute(name = "personRole", required = true)
	private String _role = "";
	
	/* Constructors & Initializers */
	public Person() { }
	
	/* Properties */
	public String getName() { return _name; }
	public void setName(String value) { _name = value; }
	
	public String getID() { return _id; }
	public void setID(String value) { _id = value; }
	
	public String getRole() { return _role; }
	public void setRole(String value) { _role = value; }
}
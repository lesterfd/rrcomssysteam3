//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Connection.java
//  @ Date : 4/1/2009
//  @ Author : 
//
//



package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import java.util.List;


/** */
public class Connection
{
    /** */
    public int connectionId;
    
    /** */
    public List<UserDefinition> remoteUsers;
    
    /** */
    public List<Medium> media;
    
    /** */
    public List<Medium> getMedia()
    {
		return media;
    
    }
}
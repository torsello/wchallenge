package com.wolox.socialnetwork.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Album implements Serializable{
	
	private static final long serialVersionUID = -3537245657884031923L;

	private long id;
	private long userId;
	private String title;
	
}

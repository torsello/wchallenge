package com.wolox.socialnetwork.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Comments implements Serializable{

	private static final long serialVersionUID = 7745538469904528149L;
	private long id;
	private long postId;
	private String name;
	private String email;
	private String body;
	
	

}

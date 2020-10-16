package com.wolox.socialnetwork.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class User implements Serializable{

	private static final long serialVersionUID = -3820744645837830472L;
	
	private long id;
	private String name;
	private String username;
	private String email;
	private List<Address> address;
	private String phone;
	private String website;
	private List<Company> company;
	
}
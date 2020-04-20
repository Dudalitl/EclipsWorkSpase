package com.syntax.class27;

public class Registration {
	
	private String userName;
	private String eMail;
	private String password;
	
	public void setName(String userName) {
		if (!userName.isEmpty()) {
			if(userName.length()>6) {
				this.userName=userName;
			}else {
			System.out.println("Please enter user name more that 6 char");	
			}
		}else {
			System.out.println("Please enter User Name");
		}
	}

}

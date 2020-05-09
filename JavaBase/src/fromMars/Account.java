package fromMars;

class Account{
	  private String acc_no;
	  private String name;
	  private String email;
	  private double amount;
	  
	  public String getAcc_no(){
	    return acc_no;
	  }
	  public String getName(){
	    return name;
	  }
	  public String getEmail(){
	    return email;
	  }
	  public double getAmount(){
	    return amount;
	  }
	  public void setAcc_no(String newAcc_no){
	    this.acc_no=newAcc_no;
	  }
	  public void setName (String newName){
	    this.name=newName;
	  }
	  public void setEmail (String newEmail){
	    this.email=newEmail;
	  }
	  public void setAmount (double newAmounnt){
	    this.amount=newAmounnt;
	  }
	}
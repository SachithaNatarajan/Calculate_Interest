package com.wipro.bank.acc;

public abstract class Account {
    protected int tenure;
    protected float principal;
    protected float rateOfInterest;
    
    public float setInterest(int age,String gender) {
    	if(age<60 && gender.equalsIgnoreCase("Male")) {
    		this.rateOfInterest=9.8f;
    	}
    	if(age>=60 && gender.equalsIgnoreCase("Male")) {
    		this.rateOfInterest=10.5f;
    	}
    	if(age<58 && gender.equalsIgnoreCase("Female")) {
    		this.rateOfInterest=10.2f;
    	}
    	if(age>=60 && gender.equalsIgnoreCase("Female")) {
    		this.rateOfInterest=10.8f;
    	}
		return rateOfInterest;
    }
    
    public float calculateMaturityAmount(float totalPrincipalDeposited,float maturityInterest) {
    	return totalPrincipalDeposited+maturityInterest;
    }
    public abstract float calculateInterest();
    public abstract float calculateAmountDeposited();
}

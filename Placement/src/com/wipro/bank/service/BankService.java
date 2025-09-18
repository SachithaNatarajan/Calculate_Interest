package com.wipro.bank.service;
import com.wipro.bank.acc.*;
import com.wipro.bank.exception.*;
public class BankService {
     public boolean validateData(float principal,int tenure,int age,String gender) throws BankValidationException {
    	 try {
    		 if(principal<500) {
    			 throw new BankValidationException();
    		 }
    		 if(!(tenure==5||tenure==10)) {
    			 throw new BankValidationException();
    		 }
    		 if(!(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))){
    			 throw new BankValidationException();
    		 }
    		 if(age<1 || age>100) {
    			 throw new BankValidationException();
    		 }
    		 return true;
    	 }
    	 catch(BankValidationException e) {
    		 System.out.println(e);
    	 }
		return false;
     }
    	 
    	 public void calculate(float principal,int tenure,int age,String gender) throws BankValidationException {
    		 if(validateData(principal,tenure,age,gender))
    		 {
    			 RDAccount rd=new RDAccount(tenure,principal);
                 rd.setInterest(age, gender);
    			 float deposited = rd.calculateAmountDeposited();
                 float interest = rd.calculateInterest();
                 float maturity = rd.calculateMaturityAmount(deposited, interest);
                 System.out.println("Total Deposited: " + deposited);
                 System.out.println("Interest Earned: " + interest);
                 System.out.println("Maturity Amount: " + maturity);
    		 }
    		 else 
    		 {
    			System.out.println("Invalid"); 
    		 }
     }
}

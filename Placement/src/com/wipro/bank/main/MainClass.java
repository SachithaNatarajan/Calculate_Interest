package com.wipro.bank.main;
import java.util.Scanner;
import com.wipro.bank.exception.BankValidationException;
import com.wipro.bank.service.BankService;
public class MainClass {
     public static void main(String[] args) throws BankValidationException {
    	 Scanner sc=new Scanner(System.in);
    	 BankService service=new BankService();
    	 System.out.print("Enter the Principal:");
    	 float principal=sc.nextFloat();
    	 System.out.print("Enter the Tenure(in years):");
    	 int tenure=sc.nextInt();
    	 System.out.print("Enter the Age:");
    	 int age=sc.nextInt();
    	 System.out.print("Enter the Gender:");
    	 String gender=sc.next();
    	 
    	service.calculate(principal,tenure,age,gender);
    	sc.close();
    	}
}

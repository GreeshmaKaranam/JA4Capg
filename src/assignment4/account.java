package assignment4;
import java.util.*;
class Person {
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
		System.out.println("\nName: "+name);
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age){
		this.age = age;
		System.out.println("Age: "+age);
	}
	
}
class Account_details {
	long accNum;
	double balance;
	String accHolder;
	 public void deposit(double x) {
		 System.out.println("Deposited Amount in" +x);
	 }
	 public void withdraw(double y) {
		 System.out.println("Amount Withdrawn: " +y);
	 }
	 public void getBalance(double total,double wtdrn) {
		 System.out.println("Balac=nce: "+(total-wtdrn));	 
	 }
	 public long getaccNum() {
			return accNum;
		}
	 public void setaccNum(long accNum){
			this.accNum = accNum;
			System.out.println("accNum: "+accNum);
		}
	 public double getbalance() {
			return balance;
		}
	 public void setbalance(double balance){
			this.balance = balance;
			System.out.println("Balance: "+balance);
		}
	 public String getaccHolder() {
			return accHolder;
		}
		public void setaccHolder(String accHolder){
			this.accHolder = accHolder;
			System.out.println("accHolder: "+accHolder);
		}
		
}

class Savings extends Account_details {
	final int MINBALANCE = 500;
	public void withdraw(int total,int draw) {
		if(total-draw>=MINBALANCE) {
			System.out.print("\nAllow Withdraw");
		}
		else
			System.out.print("\nWithdrawal is Rejected");
	}
}

class current extends Account_details {
	int overdraft_limit = 200;
	public void withdraw(int total,int draw) {
		if(total - draw == overdraft_limit) {
			System.out.println("\nTrue,Overdraft limit is reached");
		}
		else
			System.out.println("\nFalse,Overdraft limit is not reached");
		
	}
}

public class account {
	public static void main(String[] args) {
		Random rm = new Random();
		
		Person ps = new Person();
		ps.setName("smith");
		ps.setAge(24);	
		
		Account_details ac = new Account_details();
		ac.setaccNum(rm.nextLong());
		ac.setbalance(2000);
		ac.setaccHolder("Smith");
		
		Person ps1 = new Person();
		ps1.setName("Kathy");
		ps1.setAge(21);
		
		Account_details ac1 = new Account_details();
		ac1.setaccNum(rm.nextLong());
		ac1.setbalance(3000);
		ac1.setaccHolder("Kathy");
		
//		ac.deposit(2000);
	//	ac1.withdraw(2000);
		
		Savings sv = new Savings();
		sv.withdraw(3000, 2500);
		current cr = new current();
		cr.withdraw(2000,200);
	}
	
}

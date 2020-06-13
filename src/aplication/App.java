package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.WithdrawException;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//Coleta de dados:
		System.out.println("Enter accout data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdraw_limit = sc.nextDouble();
		
		System.out.println();
		
		
		//Criação da conta: 
		Account acc = new Account(number, holder, balance, withdraw_limit);
					
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		try {
		acc.withdraw(amount);
		System.out.println("New Balance: " + acc.getBalance());
		}
		catch (WithdrawException e){
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		
				
		
		
	}

}

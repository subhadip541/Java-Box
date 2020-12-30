package com.aot.classobject;

import java.util.Scanner;

public class BankAccount {
	String name, address, accountNum;
	double balance;

	BankAccount() {
		this.name = null;
		this.address = null;
		this.accountNum = null;
		this.balance = 0.0;
	}

	BankAccount(String name, String address, String accountNum) {
		this.name = name;
		this.address = address;
		this.accountNum = accountNum;
		this.balance = 0.0;
	}

	static void deposit(BankAccount account, double deposit) {
		account.balance += deposit;
	}

	static void withdraw(BankAccount account, double withdrawal) {
		if (account.balance >= withdrawal) {
			account.balance -= withdrawal;
			System.out.printf("Withdrew %.2f from account. Balance left: %.2f", withdrawal, account.balance);
			System.out.println("");
		} else {
			System.out.println("Withdrawal not possible, balance too low.");
		}
	}

	static void showDetails(BankAccount account) {
		System.out.println("Name: " + account.name);
		System.out.println("Address: " + account.address);
		System.out.println("Account Number: " + account.accountNum);
		System.out.println("Balance: " + account.balance);
	}

	public static void main(String[] args) {
		String name, address, accountNum;
		Scanner input = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[10];
		int pos = 0;
		int c = 1;

		while (c != 0) {
			System.out.println("Enter your choice:");
			System.out.println("  1.Create an account\n  2.Use an existing account");
			int choice1 = input.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("Enter your name: ");
				name = new Scanner(System.in).nextLine();
				System.out.println("Enter your address: ");
				address = new Scanner(System.in).nextLine();
				accountNum = "112254125" + String.valueOf(pos);
				accounts[pos] = new BankAccount(name, address, accountNum);
				System.out.println("------------------------Details------------------------");
				showDetails(accounts[pos++]);
				break;

			case 2:
				System.out.println("Enter the bank account number: ");
				String number = new Scanner(System.in).nextLine();
				int flag = 0, index = 0;
				for (int i = 0; i < pos; i++) {
					if (accounts[i].accountNum.equals(number) && accounts[i].accountNum != null) {
						flag = 1;
						index = i;
					}
				}
				if (flag == 0) {
					System.out.println("Sorry the account could not be found!\n Try creating a new account.");
				} else {
					System.out.println("What do you want to do?");
					System.out.println("  1.Deposit an amount\n  2.Withdraw an amount\n  3.Show Details");
					int choice2 = new Scanner(System.in).nextInt();
					switch (choice2) {
					case 1:
						System.out.print("Enter your deposit amount: ");
						double depositAmount = input.nextDouble();
						deposit(accounts[index], depositAmount);
						System.out.println("Amount Deposited!");
						break;

					case 2:
						System.out.print("Enter your withdrawal amount: ");
						double withdrawal = input.nextDouble();
						withdraw(accounts[index], withdrawal);
						break;

					case 3:
						showDetails(accounts[index]);
						break;

					default:
						System.out.println("Invalid input");
						break;
					}
				}
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println("\nDo you want to continue? Press 1 to continue or 0 Exit");
			c = input.nextInt();
			if (c == 0) {
				System.out.println("Thank you for using our service! Have a good day.");
			}
		}
	}
}
package com.greatlearnig.lab.transaction;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Transaction transaction= new Transaction();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(Integer.MAX_VALUE);
			System.out.println("Enter the size of the transaction array");
			int size =sc.nextInt();
			int[] transactions =new int [size];
			System.out.println("Enter the vaues of the transaction");
			for (int i=0; i<size; i++) {
				transactions[i] = sc.nextInt();
			}
			System.out.println("Enter the number of targets needs to be checked");
			int targetSize = sc.nextInt();
			for(int i=0; i<targetSize; i++) {
				System.out.println("Enter the target value");
			}
			int target = sc.nextInt();
			int res = transaction.targetCheck(transactions, target);
			if( res >= 0) {
				System.out.println("The target can be achieved after "+(int) (res+1) +" transactions");
			}else {
				System.out.println("The target cannot be achieved with given transaction");
			}
		}
		
	}
	}


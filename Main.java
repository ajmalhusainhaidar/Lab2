package com.greatlearning.currency;

public class Main {

	public static void main(String[] args) {
		int denominations[]= {60,5,12,78,25};
		int payValue = 128;
		MergeSortDesc sort = new MergeSortDesc();
		sort.sort(denominations,0,denominations.length-1);
		for(int val : denominations) {
			System.out.println(val + " ");
		}
		System.out.println(" ");
		Currency curr= new Currency();
		curr.currencyCount(denominations,payValue);
		
		// TODO Auto-generated method stub

	}

}

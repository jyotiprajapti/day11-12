package com.practice.oop;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAcc {
	Scanner sc = new Scanner(System.in);
	String stockName;
	int numberOfShare;
    int sharePrice;
    int totalValueOfEachStock;
    int totalValueOfStock;
    StockAcc  stock;
	 ArrayList <StockAcc> shares = new ArrayList<StockAcc>();
	 
    public void addStock() {
    	    System.out.println("enter stock name ");
    	    stock.stockName = sc.nextLine();
    		System.out.println("enter number of share");
    		stock.numberOfShare = sc.nextInt();
    		System.out.println("enter share price ");
    		stock.sharePrice = sc.nextInt();
    		System.out.println("enter stock value of each stock");
    		stock.totalValueOfEachStock = sc.nextInt();
    		shares.add(stock);
    }
  
    
    
    
}

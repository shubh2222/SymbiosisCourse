package com.myshop.home;
import java.util.Scanner;
public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		while(true) {
		System.out.println("Press 1 for add data \n Press 2 for see data\nPress 3 for update data");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			op.setData();
			break;
		case 2:
			op.getData();
			break;
		case 3:
			op.updateData();
		}
	}
  }		
}

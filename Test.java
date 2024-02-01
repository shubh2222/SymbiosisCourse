package com.interfaceabbeg;
import java.util.Scanner;
public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Mobiles\t Press 2 for Tv\t Press 3 for Ac: ");
		Operations opti = new Operations();
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			
			opti.getMobiles();
			break;
		case 2:
			opti.getTv();
			break;
		case 3:
			opti.getAc();
			break;
		}
	}

	

}

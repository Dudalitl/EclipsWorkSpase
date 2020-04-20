package com.syntax.class06;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "belarus":
			food="potato";
			break;
		case "morocco":
			food="couscous";
			break;
		case "turke":
			food="Baklava";
		case "usa":
			food="Burger";
			break;
		case "ukrain":
			food="Borosh";
			break;
			default:
				food="no answer";
		}
			
		System.out.println("Your favorit food is "+food);
		
		
		}

	}



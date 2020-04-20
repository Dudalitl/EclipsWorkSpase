package com.syntax.class06;

import java.util.Scanner;

public class LanguageAndCountry {
	
	public static void main (String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "usa" :
			language="English";
			break;
		case "russia" :
			language="Russian";
			break;
		case "france":
			language="Franch";
			break;
		case "german":
			language="German";
			break;
		case "chaina":
			language="Chainese";
			break;
		case "spania":
			language="Spanish";
			break;
		case "portugalia":
			language="Portugese";
			break;
			default:
			language="is not detekted";
			
		}
		System.out.println("Language in your countri  "+language);
		
	}

}

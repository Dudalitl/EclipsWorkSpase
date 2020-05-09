package com.syntax.homework;

import java.util.Scanner;

//
public class Bbbb {
  
  String text;
  char letter;
  
  void censorLetter() {
    System.out.println(text.replace(letter, '*'));
  }
  
  public static void main (String[] args){
    
    Bbbb obj=new Bbbb();
    obj.text="computer science";
    obj.letter='e';
    obj.censorLetter();
  }
  
}

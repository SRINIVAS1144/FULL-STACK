package com.careerit.corejava.day2;

import java.util.Scanner;

public class SimpleIfExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age :");
    int age = sc.nextInt();
    if(age < 0){
        age = -age;
    }
    System.out.println("Entered age :"+age);
  }
}

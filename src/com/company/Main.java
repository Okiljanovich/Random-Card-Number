package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner=new Scanner(System.in);
        System.out.println("Iltimos kerak bo'ladigan karta toifasini kiring:");
        System.out.println( "1->HUMO");
        System.out.println( "2->UZcard");
        int prefix=0;

            prefix=scanner.nextInt();
            switch (prefix){
                case 1:{
                    System.out.print("9860 ");
                    break;
                }
                case 2: {
                    System.out.print("8600 ");
                break;
                }default:{
                    System.out.print("Karta kiritmadingiz");
                break;
                }
            }

            int j = 0;
            while(j < 3) {
                int r = (int)(Math.random()*10000) + 1;
                if(r < 999){
                    continue;
                }
                else{
                    j++;
                    System.out.print(r + " ");
                }

            }

            System.out.println();

    }
}





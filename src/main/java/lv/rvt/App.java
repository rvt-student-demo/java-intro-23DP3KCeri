package lv.rvt;

import java.util.Scanner;

public class App 
{ 
    public static void printStars(int number) {
        int times = 0;
        String star = "*";
        while (times<number){
            System.out.print(star);
            times += 1;
        }

    }
    
    public static void main(String[] args) {
        printStars(5);
        System.out.println("");
        printStars(3);
        System.out.println("");
        printStars(9);
    }
} 
    



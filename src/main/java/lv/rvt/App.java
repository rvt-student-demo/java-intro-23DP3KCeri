package lv.rvt;

import java.util.*;

public class App 
{ 
    public static void main(String[] args) {
        christmasTree(4);
    }  

    public static void christmasTree(int height){
        for(int i= 1; i <= height; i++){
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println();
        }

        for(int i=0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void printSpaces(int count){
        for (int i = 0; i < count; i++){
            System.out.print(" ");
        }
    }
    
    public static void printStars(int count){
        for (int i = 0; i < count; i++){
            System.out.print("*");
        }
    }
} 
    



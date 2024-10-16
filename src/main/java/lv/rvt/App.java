package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("");
        while(true){
            int number = scanner.nextInt();
            if(number==0){
                break;
            }
            numbers.add(number);
        }
        System.out.println("");
        for (int num : numbers){
            System.out.println(num);
        }
        int sum = 0;
        for (int num : numbers){
            sum+=num;
        }
        System.out.println("" + sum);
        scanner.close();
    }
} 
    



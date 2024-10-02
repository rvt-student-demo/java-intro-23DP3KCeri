package lv.rvt;

import java.util.Scanner;

public class App 
{ 

public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            int evenCount = 0;
            int oddCount = 0;
    
            System.out.println("Write numbers:");
    
            while (true) {
                int num = scanner.nextInt();
                if (num == -1) {
                    System.out.println("Thx! Bye!");
    
                    System.out.println("Sum: " + sum);
    
                    System.out.println("Numbers: " + count);
    
                    if (count > 0) {
                        double average = (double) sum / count;
                        System.out.println("Average: " + average);
                    }
    
                    System.out.println("Even: " + evenCount);
                    System.out.println("Odd: " + oddCount);
    
                    break;
                }
    
                sum += num;
                count++;
    
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
    
            scanner.close();
        }
    } 
    



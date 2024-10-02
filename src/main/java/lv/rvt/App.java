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
                // If user inputs -1, break the loop
                if (num == -1) {
                    System.out.println("Thx! Bye!");
    
                    // Part 2: Sum of numbers
                    System.out.println("Sum: " + sum);
    
                    // Part 3: Number of numbers entered (excluding -1)
                    System.out.println("Numbers: " + count);
    
                    // Part 4: Average of the numbers (excluding -1)
                    if (count > 0) {
                        double average = (double) sum / count;
                        System.out.println("Average: " + average);
                    }
    
                    // Part 5: Even and Odd numbers
                    System.out.println("Even: " + evenCount);
                    System.out.println("Odd: " + oddCount);
    
                    break;
                }
    
                // Update the sum and count
                sum += num;
                count++;
    
                // Check if the number is even or odd
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
    
            scanner.close();
        }
    } 
    



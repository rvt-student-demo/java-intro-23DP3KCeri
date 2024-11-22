package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }

            System.out.println("Publication year: ");

            int inputPubYear = Integer.valueOf(scanner.nextLine());

            System.out.println("Pages: ");

            int inputPages = Integer.valueOf(scanner.nextLine());

            books.add(new Books(inputTitle, inputPages, inputPubYear));
        }

        System.out.println("What information will be printed? ");

        String whatToPrint = scanner.nextLine();

        if (whatToPrint.toLowerCase().equals("everything")) {
            for (Books element : books) {
                System.out.println(element);
            }
        }
        if (whatToPrint.toLowerCase().equals("name")) {
            for (Books element : books) {
                System.out.println(element.getTitle());
            }
            
        } 
        else {
           return;
        }

    }
}

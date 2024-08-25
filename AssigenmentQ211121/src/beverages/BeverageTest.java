package beverages;

import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.print("Do you want extras with your tea (yes/no)? ");
        String teaExtras = scanner.nextLine().trim().toLowerCase();
        tea.setWantsExtras(teaExtras.equals("yes"));

        System.out.print("Do you want extras with your coffee (yes/no)? ");
        String coffeeExtras = scanner.nextLine().trim().toLowerCase();
        coffee.setWantsExtras(coffeeExtras.equals("yes"));

        System.out.println("\nMaking tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee...");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}

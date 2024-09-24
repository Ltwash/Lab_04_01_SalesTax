import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemPrice;
        double salesTax;
        double totalCost;

        System.out.println("What is the price of your Item?");

        itemPrice = in.nextDouble();
        salesTax = itemPrice * 0.05;
        totalCost = itemPrice + salesTax;
        System.out.println("The Sales tax on your item is " + salesTax + ", The original price was " + itemPrice);
        System.out.println("The total cost is " + totalCost);
    }
}
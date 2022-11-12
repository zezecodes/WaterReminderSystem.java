import java.util.Random;
import java.util.Scanner;

public class WaterReminderSystem {
    public static void main(String[] args){
        System.out.println("Welcome to the water reminder system!\n------------------------------------");

        // List of healthy water facts that change everytime user launches program
        String[] waterQuotesList = new String[] {"Adult humans are 60 percent water, and our blood is 90 percent water", "The average amount of water you need per day is about 3 liters (13 cups) for men and 2.2 liters (9 cups) for women",
                "Water is essential for the kidneys and other bodily functions", "When dehydrated, the skin can become more vulnerable to skin disorders and wrinkling",
                "Drinking water instead of soda can help with weight loss", "Around 71 percent of the planet’s surface is covered by water", "Drinking water cushions the brain, spinal cord, and other sensitive tissues",
                "Approximately 80'%' of your brain tissue is made of water"};
        // initializing variables for inputs
        int bottleInputNumber, bottleRefillNumber, bottleTakeoutNumber ,bottleReminderNumber ;

        // Generating and printing out random quotes from waterQuotesList array
        Random quotes = new Random();
        int quotesItem = quotes.nextInt(waterQuotesList.length);
        String randomQuotesGenerator = waterQuotesList[quotesItem].toLowerCase();

        String emojis = "✨";
        System.out.println(emojis+"Did you know "+randomQuotesGenerator+"?");

        // Gets the number of bottles put in the fridge everyday
        Scanner bottleInput = new Scanner(System.in);
        System.out.print("How many bottles do you normally put in the refrigerator daily? - ");
        bottleInputNumber = bottleInput.nextInt();

        System.out.print("How many times do you refill your fridge? - ");
        bottleRefillNumber = bottleInput.nextInt();

        System.out.print("How many times do you take water out of the fridge? - ");
        bottleTakeoutNumber = bottleInput.nextInt();

        System.out.print("How many bottles should be in the fridge for reminder to begin? - ");
        bottleReminderNumber = bottleInput.nextInt();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BurritoCustomization
{
    public static void main(String [] args)
    {
        /*Week Two Challenge: Write a program that will allow a robot to assemble 10 burritos.
          Use a random generator for each burrito customizations*/
        Random rand = new Random();
        Scanner keyboard= new Scanner(System.in);
        String userResponse="";
        int userResponsenum=10;


        ArrayList<String> Rice = new ArrayList<String>();
        Rice.add("white");
        Rice.add("brown");
        Rice.add("no rice");

        ArrayList<String> Meat = new ArrayList<String>();
        Meat.add("chicken");
        Meat.add("steak");
        Meat.add("carnidas");
        Meat.add("chorizo");
        Meat.add("sofritas");
        Meat.add("veggies");

        ArrayList<String> Beans = new ArrayList<String>();
        Beans.add("pinto");
        Beans.add("black");
        Beans.add("no beans");

        ArrayList<String> Salsa = new ArrayList<String>();
        Salsa.add("mild");
        Salsa.add("medium");
        Salsa.add("hot");
        Salsa.add("no salsa");

        ArrayList<String> Veggies = new ArrayList<String>();
        Veggies.add("lettuce");
        Veggies.add("fajita veggies");
        Veggies.add("no veggies");

        System.out.println("How many burritos would like to order, please ?");
        System.out.println("I would like to order 10 burritos with random selections.");
        System.out.println("Enter Exactly the number 10.");
        userResponse = keyboard.nextLine();

        for(int i=0; i<=9; i++)
        {
            //generating random indexes from all the 5 array lists and assigning them
                int rice_random=rand.nextInt(Rice.size());
                int meat_random=rand.nextInt(Meat.size());
                int beans_random=rand.nextInt(Beans.size());
                int salsa_random=rand.nextInt(Salsa.size());
                int veggies_random=rand.nextInt(Veggies.size());
                System.out.println("Burrito: "+ Rice.get(rice_random)+ ", "+ Meat.get(meat_random)+", "+
                        Beans.get(beans_random) + ", "+ Salsa.get(salsa_random)+ "," +Veggies.get(veggies_random));

        }
        System.out.println("Thanks for your order, please come again");
    }
}

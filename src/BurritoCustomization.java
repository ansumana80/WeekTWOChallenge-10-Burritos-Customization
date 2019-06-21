import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BurritoCustomization
{
    public static void main(String [] args)
    {
        /*Week Two Challenge: Write a program that will allow a robot to assemble 10 burritos.
          Use a random generator for each burrito customizations*/
        Random rand = new Random();
        Scanner keyboard= new Scanner(System.in);
        String userResponse="";

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

        int index1= Rice.size();
        int index2 =Meat.size();
        int index3=Beans.size();
        int index4=Salsa.size();
        int index5=Veggies.size();



            System.out.println("May I order 10 burritos in random combination?");

            //Take user's response
            userResponse=keyboard.nextLine();
            int num=0;

            do {int rice_random=rand.nextInt(Rice.size());

                int meat_random=rand.nextInt(Meat.size());

                int beans_random=rand.nextInt(Beans.size());

                int salsa_random=rand.nextInt(Salsa.size());

                int veggies_random=rand.nextInt(Veggies.size());

//
//
                System.out.println("Burito" + num + Rice.get(rice_random) + Meat.get(meat_random) + Beans.get(beans_random)
                + Salsa.get(salsa_random)+ Veggies.get(veggies_random));




            }while (!userResponse.equalsIgnoreCase("n"));
             keyboard.close();













    }
}

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

        do {

            int rice_random=rand.nextInt(Rice.size());
            System.out.println(Rice.get(rice_random));

            int meat_random=rand.nextInt(Meat.size());
            System.out.println(Rice.get(meat_random));

            int beans_random=rand.nextInt(Beans.size());
            System.out.println(Rice.get(beans_random));

            int salsa_random=rand.nextInt(Salsa.size());
            System.out.println(Rice.get(salsa_random));

            int veggies_random=rand.nextInt(Veggies.size());
            System.out.println(Rice.get(veggies_random));


        }while (!userResponse.equalsIgnoreCase("n"));
        keyboard.close();













    }
}

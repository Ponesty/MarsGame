import java.util.Scanner;
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Mars adventure trip!");
        System.out.println("We've giving you a great opportunity to be the very first test subject on Mars!");
        System.out.println("Lets get things going. First off, please state your name:");
        String name = input.nextLine();
        System.out.format("Mars test subject %s has just signed their life away.",name);
        System.out.println("...now that you're legally locked into this, lets continue.");
        System.out.println("How many Earth orbits around the sun have you experienced?");
        int age = Integer.parseInt(input.nextLine());
        if(age >=30 ) System.out.println("Ah, so you've experienced the creation of the universe. Congrats ancient one!");
        else System.out.println("We love to see young test subjects, they last longer.");
        System.out.println("So, how many very important items do you plan on bringing?");
        int items = Integer.parseInt(input.nextLine());
        System.out.format("Awesome! We'll be confiscating all of your %d items.\nYou'll get them back if you survive the experiments...",items);
        System.out.println("Speaking of painful experiences, we heard you can tolerate pain pretty well. \nIs this true or false?");
        boolean tolerance = Boolean.parseBoolean(input.nextLine());
        if(tolerance) System.out.println("Well that's not fun. We'll rework your pain receptors to meet M.E.R. standards (Martian Experimental requirements.)");
        else System.out.println("Don't worry, someone once told me pain is all in the mind...but for you it may be everywhere.");
        System.out.println("Next question, how much do you weigh? Please provide a decimal number.");
        double weight = Double.parseDouble(input.nextLine());
        System.out.println("Um...we don't have enough rocket fuel to get you to Mars. But you're in luck, we have been meaning to test out our company made fuel supply/life support system!\nIt produces more radiation than a white dwarf but at the same time keeps you alive. You may pass out from the excruciating pain a few times throughout the trip.");
        System.out.println("Are you ready to go? Y/N");
        String doesNotMatter = input.nextLine();
        System.out.println("Alright, everything is ready. Make sure you bring a blanket, we did not have time to provide heating. But the radiation should help keep you warm. Start the count down!");
        Thread.sleep(5000);
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        };
        System.out.println("BLAST OFF!!!");
        Thread.sleep(3000);
        System.out.println("........");
        Thread.sleep(2000);
        System.out.println("wait..");
        Thread.sleep(2000);
        System.out.format("We forgot to give %s food and oxygen.", name);
        Thread.sleep(2000);
        System.out.println("\nOh well, life support will keep them alive. Too bad it doesn't stop pain.");


    }
}

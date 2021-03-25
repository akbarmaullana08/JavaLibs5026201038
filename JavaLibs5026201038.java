import java.util.Scanner;

public class JavaLibs5026201038 {
    public static void main(String [] args) {

        String name, from, hobby, beer, place, cat;
        double petbill, food;
        int jumlahpet, kucing;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Hi! Whats your name?");
        name = keyboardInput.nextLine();
        System.out.print("Where are your from?");
        from = keyboardInput.nextLine();
        System.out.print("What is your favorite animal?");
        hobby = keyboardInput.nextLine();
        System.out.print("What is your favorite drink?");
        beer = keyboardInput.nextLine();
        System.out.print("Really, we should drink " + beer + " with " + hobby + ". You have any suggestions about the place?");
        place = keyboardInput.nextLine();
        System.out.print("What color is your " + hobby + "?");
        cat = keyboardInput.nextLine();
        System.out.print("How many " + hobby + " do you want?");
        kucing  = keyboardInput.nextInt();
        System.out.print("What if 2 " + hobby + " runs away from you, how many " + hobby + " do you have?");
        jumlahpet  = kucing-2;
        System.out.println(" The remaining " + hobby + " are: "+ jumlahpet);
        System.out.print("How much money do you spend on " + hobby + " food?");
        food = keyboardInput.nextDouble();
        System.out.println("If you have 9.9 now and you buy " + hobby +" foods, how much your money left?");
        petbill = 9.9-food;
        System.out.println(" Money Left is: "+petbill);


        System.out.println("Listen friend, im gonna tell you a story about a man that have " + jumlahpet +" " + hobby + " \n"
                + "His name is " + name + " and he is from " + from + ", the land of " + hobby + ". His hobby is so pathetic, guess \n"
                + "what? He's likes to " + hobby + ". Awesome right, what an unusual guy i met. He and his " + hobby+ " likes to \n"
                + "drink " + beer + " in " + place + " near Surabaya. He spend " + food + " for all the " + hobby + " he \n"
                + "has, especially for the " + cat + " " + hobby);

    }
}







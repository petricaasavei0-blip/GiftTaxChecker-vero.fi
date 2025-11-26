import java.util.Scanner;

public class GiftTaxChecker {
    public static void main(String[] main) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password for more access :)");
        String password = scan.nextLine();

        if (password.equals("First")) {
            // If correct password :)
            System.out.println("Type A if this is for close relatives or B if for distant ones");
            String relatives = scan.nextLine();
            if (relatives.equals("A")) {               
            
            System.out.println("Value of the gift?");
            int gift = Integer.valueOf(scan.nextLine()); 
            
            // ---- Tax logic ----
            if (gift >= 5000 && gift < 25000) {
            double firstbracket = (100 + (gift - 5000) * 0.08);
            System.out.println(firstbracket);
        } else if (gift >= 25000 && gift < 55000) {
            double secondbracket = (1700 + (gift - 25000) * 0.10);
            System.out.println(secondbracket);
        } else if (gift >= 55000 && gift < 200000) {
            double thirdbracket = (4700 + (gift - 55000) * 0.12);
            System.out.println(thirdbracket);
        } else if (gift >= 200000 && gift < 1000000) {
            double fourthbracket = (22100 + (gift - 200000) * 0.15);
            System.out.println(fourthbracket);
        } else if (gift >= 1000000) {
            double lastbracket = (142100 + (gift - 1000000) * 0.17);
            System.out.println(lastbracket);
        } else {
            System.out.println("No tax!");
            }
            // If relatives are distant
    } else if (relatives.equals("B")) {
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        
        // Tax for distant relatives
        if (gift >= 5000 && gift < 25000) {
            double firstbracket = (100 + (gift - 5000) * 0.19);
            System.out.println(firstbracket);
        } else if (gift >= 25000 && gift < 55000) {
            double secondbracket = (3900 + (gift - 25000) * 0.25);
            System.out.println(secondbracket);
        } else if (gift >= 55000 && gift < 200000) {
            double thirdbracket = (11400 + (gift - 55000) * 0.29);
            System.out.println(thirdbracket);
        } else if (gift >= 200000 && gift < 1000000) {
            double fourthbracket = (53450 + (gift - 200000) * 0.31);
            System.out.println(fourthbracket);
        } else if (gift >= 1000000) {
            double lastbracket = (301450 + (gift - 1000000) * 0.33);
            System.out.println(lastbracket);
        } else {
            System.out.println("No tax!");
            }
        // If any other answer than A or B
        } else {
        System.out.println("Select a valid answer!");
        }
        // If password wrong :(
        } else {
            System.out.println("GTFO!");
        }
    }
}
        
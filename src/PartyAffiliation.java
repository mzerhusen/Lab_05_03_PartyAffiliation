import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userAffiliation;
        System.out.println("Thank you for sharing your information. Please select your party affiliation below: \n Democrat - D \t Republican - R \t Independent - I");
        System.out.print("Your selection for party affiliation is: ");
        userAffiliation = input.nextLine();
        userAffiliation = userAffiliation.toUpperCase();
        if(userAffiliation.equals("D"))
        {
            System.out.println("You selected Democrat, you get a donkey!");
        }
        else if (userAffiliation.equals("R"))
        {
            System.out.println("You selected Republican, you get an elephant!");
        }
        else if (userAffiliation.equals("I"))
        {
            System.out.println("You selected Independent, you get a person avatar!");
        }
        else
        {
            System.out.println("You selected a non-standard party, " + userAffiliation + "!");
        }
    }
}
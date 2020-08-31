import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Text eingeben: ");
        String text = sc.nextLine();
        int translation = (int) (Math.random() * 26) + 1;
        System.out.print("Verschiebung um " + translation + " Stellen");
        String ausgabe = "";

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);
            int index = letter + translation;
            char newLetter = (char) index;
            ausgabe += newLetter;

        }

        System.out.println(ausgabe.toUpperCase());

    }

}


import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib Text ein: ");
        String s = sc.nextLine();

        char[] klarText = s.toCharArray();
        char[] coded = new char[klarText.length];

        int verschiebung = 6; //(int) (Math.random() * 26) + 1;

        for (int i = 0; i < klarText.length; i++) {

            int offset;

            if (klarText[i] >= 'a' && klarText[i] <= 'z' || klarText[i] >= 'A' && klarText[i] <= 'Z') {

                offset = (char) ((klarText[i] - 'a' + verschiebung) % 26 + 'a');
                coded[i] = (char) offset;

            } else if (klarText[i] == ' ' || klarText[i] == '!') {

                offset = (char) (klarText[i]);
                coded[i] = (char) offset;
            }

            System.out.print(coded[i]);

        }
    }
}


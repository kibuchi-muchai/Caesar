import Models.Decryption;
import Models.Encryption;

import java.util.Locale;
import java.util.Scanner;

public class App {
    private static int encryptKey;

    public static void main(String[] args) {
        System.out.print("1. Encryption\n2. Decryption\nChoose(1,2):");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        String decryptMsg = null;
        if (choice == 1) {
            System.out.println("Encryption");
            in.nextLine();

            System.out.println("Message can only be lower or uppercase alphabet");
            System.out.print("Enter Message:");
            String msg = in.nextLine();

            System.out.print("Enter key (0-25):");
            int key = in.nextInt();

            String encryptMsg = "";

            for (int i = 0; i < msg.length(); i++) {
                if ((int) msg.charAt(i) == 32) {
                    encryptMsg += (char) 32;

                } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                    int temp = ((int) msg.charAt(i) + key) - 90;
                    encryptMsg += (char) (64 + temp);

                } else {
                    encryptMsg += (char) ((int) msg.charAt(i) + key);
                }

            }
            System.out.println(encryptMsg);
        } else if (choice == 2) {
            System.out.println("Decryption");
            in.nextLine();

            System.out.println("Message can only be upper or lowercase alphabet");
            System.out.print("Enter encrypted Text:");
            String encryptText = in.nextLine();


            System.out.println("Enter key(0-25):");
            int decrypt = in.nextInt();

            decryptMsg = "";

            for (int i = 0; i < encryptText.length(); i++) {
                int decryptkey = 0;
                if ((int) encryptText.charAt(i) == 32) {
                    decryptMsg += (char) 32;
                } else if (((int) encryptText.charAt(i) - decryptkey) < 97 && ((int) encryptText.charAt(i) - decryptkey) > 90) {
                    int temp = ((int) encryptText.charAt(i) - decryptkey) + 26;
                    decryptMsg += (char) temp;

                } else if ((encryptText.charAt(i) - decryptkey) < 65) {
                    int temp = ((int) encryptText.charAt(i) - decryptkey) + 26;
                    decryptMsg += (char) temp;
                } else {
                    decryptMsg += (char) ((int) encryptText.charAt(i) - decryptkey);

                }
            }
            System.out.println(decryptMsg);
        } else {
            System.out.println("Wrong Choice");
        }
    }
}
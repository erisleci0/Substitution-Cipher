import java.util.Scanner;

public class Main {

    public static void encryption(String text, int key){
        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            int asciiValue = (int) currentChar;
            int encChar = asciiValue + key;
            char encryptedChar = (char) encChar;
            System.out.print(encryptedChar);
        }
    }
    public static void decryption(String text, int key){
        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            int asciiValue = (int) currentChar;
            int encChar = asciiValue - key;
            char decryptedChar = (char) encChar;
            System.out.print(decryptedChar);
        }
    }
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("[1] Encryption: ");
            System.out.println("[2] Decryption: ");
            int operation = scanner.nextInt();
            scanner.nextLine();
            if(operation == 1){
                System.out.println("PlainText: ");
                String plainText = scanner.nextLine();
                System.out.println("EncryptionKey: ");
                int encKey = scanner.nextInt();
                encryption(plainText, encKey);
                System.out.println(" ");
            }
            else if(operation == 2){
                System.out.println("CipherText: ");
                String cipherText = scanner.next();
                System.out.println("DecryptionKey: ");
                int decKey = scanner.nextInt();
                decryption(cipherText, decKey);
                System.out.println(" ");
            }
        }
    }
}
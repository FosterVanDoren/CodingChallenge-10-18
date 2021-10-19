package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string to encode");
        String encodeString = scan.nextLine();
        System.out.println(atbashCipher(encodeString));
    }

    private static String atbashCipher(String encodeString) {
        StringBuilder cipher = new StringBuilder();
        for(int i = 0; i < (encodeString.length()); i++){
           char c = encodeString.charAt(i);
            if (Character.isUpperCase(c)){
                cipher.append((char)(('Z'-c)+'A'));
            } else if (Character.isLowerCase(c)){
                cipher.append((char) (('z' - c)+'a'));
            }else  if (Character.isSpaceChar(c)){
                cipher.append(c);
            }
        }
        return cipher.toString();
    }
}

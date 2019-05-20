import java.util.*;
class Test1{
 public static void main(String args[])throws Exception
 {
  RailFenceBasic rf=new RailFenceBasic(); 
                Scanner scn=new Scanner(System.in);
                int depth, round;
   
                String plainText,cipherText,decryptedText;
                 
                System.out.println("The plaintext is: CRYPTOLOGY IS THE PRACTICE AND STUDY OF TECHNIQUES FOR SECURE COMMUNICATION IN THE PRESENCE OF THIRD PARTIES CALLED ADVERSARIES.");
                plainText="CRYPTOLOGY IS THE PRACTICE AND STUDY OF TECHNIQUES FOR SECURE COMMUNICATION IN THE PRESENCE OF THIRD PARTIES CALLED ADVERSARIES.";
                System.out.println("Depth = 4, Round = 5");
                depth=4;
                round=5;
                
  cipherText=rf.Encryption(plainText,depth, round);
  System.out.println("Encrypted text is:\n"+cipherText);
                 
                decryptedText=rf.Decryption(cipherText, depth, round);
                 
  System.out.println("Decrypted text is:\n"+decryptedText);
  
  
 }
}
import java.util.*;
class RailFence{
 public static void main(String args[])throws Exception
 {
  RailFenceBasic rf=new RailFenceBasic(); 
                Scanner scn=new Scanner(System.in);
                int depth, round;
   
                String plainText,cipherText,decryptedText;
                 
                System.out.println("Enter plain text:");
                plainText=scn.nextLine();
                 
                System.out.println("Enter depth for Encryption:");
                depth=scn.nextInt();
                
                System.out.println("Enter round for Encryption:");
                round=scn.nextInt();
                
  cipherText=rf.Encryption(plainText,depth, round);
  System.out.println("Encrypted text is:\n"+cipherText);
                 
                decryptedText=rf.Decryption(cipherText, depth, round);
                 
  System.out.println("Decrypted text is:\n"+decryptedText);
  
  
 }
}
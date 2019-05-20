import java.util.*;
class Test2{
 public static void main(String args[])throws Exception
 {
  RailFenceBasic rf=new RailFenceBasic(); 
                Scanner scn=new Scanner(System.in);
                int depth, round;
   
                String plainText,cipherText,decryptedText;
                 
                cipherText="TAOTINEN KAT I ODIOAEI OHHLSCTE TTETOEL BI IHI GAO EPSEA TO SS EEK ELRCPTSIY EANRPHMCYEK E CREAAIEJURTE IEASHI MA DRN RH AUWTA RF EFTFHENTPSF Q TAILB E TTECAPMSIYIY SRPURNTBL YCL OANAO E TVREAOSHOTTNULSRHK";
                System.out.println("The ciphertext is:"+cipherText );
                System.out.println("Depth = 3, Round = 3");
                depth=3;
                round=3;            
                decryptedText=rf.Decryption(cipherText, depth, round);
                 
  System.out.println("Decrypted text is:\n"+decryptedText);
  
  
 }
}
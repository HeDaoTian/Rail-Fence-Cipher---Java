import java.util.*;
class RailFenceBasic{
 int depth;
 String Encryption(String plainText,int depth, int round)throws Exception
 {
   
   if(round==0){return plainText;}
  char arr[][]=new char[depth][plainText.length()];
  boolean dir_down = false;
  
  for (int i=0; i < depth; i++) 
        for (int j = 0; j < plainText.length(); j++) 
            arr[i][j] = '\n'; 
  int r = 0, c = 0;
  for (int i=0; i < plainText.length(); i++) 
    { 
        // check the direction of flow 
        // reverse the direction if we've just 
        // filled the top or bottom rail 
        if (r == 0 || r == depth-1) 
            dir_down = !dir_down; 
  
        // fill the corresponding alphabet 
        arr[r][c++] = plainText.charAt(i); 
  
        // find the next row using direction flag 
        if(dir_down){
          r++;}else{
          r--; 
          }
    } 
  String cipherText="";
  for (int i=0; i < depth; i++) {
    for (int j=0; j < plainText.length(); j++) {
            if (arr[i][j]!='\n') 
                cipherText+=arr[i][j]; 
    }
  }
  return Encryption(cipherText, depth, round-1);
 }
  
  
 String Decryption(String cipherText,int depth, int round)throws Exception
 {
   if(round==0){return cipherText;}
   char arr[][]=new char[depth][cipherText.length()];
   
   for (int i=0; i < depth; i++) 
        for (int j = 0; j < cipherText.length(); j++) 
            arr[i][j] = '\n'; 
   
   boolean dir_down=true;
   int r = 0, c = 0;
   
   for(int i=0; i<cipherText.length(); i++){
     if(r==0){dir_down = true;}
     if(r==depth-1){dir_down = false;}
     
     arr[r][c++] = '*';
     
     if(dir_down){r++;}
     if(!dir_down){r--;}
   }
   
   int index = 0;
   for(int i=0; i<depth; i++)
     for(int j=0; j<cipherText.length(); j++){
     if(arr[i][j]=='*'&&index<cipherText.length()){
     arr[i][j]=cipherText.charAt(index++);
     }
   }
   
   String plainText="";
   r=0; 
   c=0;
   
   for(int i=0; i<cipherText.length();i++){
   if(r==0)
     dir_down=true;
   if(r==depth-1)
     dir_down=false;
   
   if(arr[r][c]!='*')
     plainText+=arr[r][c++];
   
   if(dir_down){
          r++;}else{
          r--; 
          }
   }
  return Decryption(plainText, depth,round-1);
 }
}
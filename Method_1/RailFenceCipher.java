public class RailFenceCipher {
	
	public void encryption(String message,Key<Integer,Integer> key)
	{
		final int d = key.d;
		final int r = key.r;
		int count = 0;
		char[] plaintext = message.toCharArray();
		final int length = plaintext.length;
		char[] ciphertext = new char[length];
		while(count<r)   //for repetition
		{
			int pPointer = 0;                 //points to the elements in the plaintext array
			int cPointer = 0;                //points to the first empty elements in the ciphertext array
			while(pPointer < d)
			{
				for(int index = pPointer; index < length;index = index+d)
				{
					ciphertext[cPointer] = plaintext[index];
					cPointer++;
				}
				pPointer++;
			}
			for(int index=0;index<length;index++)
			{
				plaintext[index]=ciphertext[index];
			}
			count++;
		}
		String result = "";
		for(int index=0; index<length;index++)
		{
			result += ciphertext[index];
		}
		System.out.print("\nThe ciphertext is: "+result);
		
		
	}
	
	public void decryption(String message,Key<Integer,Integer> key) 
	{
		final int d = key.d;
		final int r = key.r;
		char[] ciphertext = message.toCharArray();
		final int length = ciphertext.length;
		char[] plaintext = new char[length];
		int count = length/d;
		if(length%d!=0)
			count++;
		int nullValue = count*d-length;
		for(int repeat=0;repeat<r;repeat++)
		{
			char[][] decryptionProcess = new char[count][];
			for(int a=0;a<decryptionProcess.length-1;a++)
				decryptionProcess[a]=new char[d];
			decryptionProcess[decryptionProcess.length-1]=new char[d-nullValue];
			int counter=0;
			int index=0;
			int index1=0;
			for(index=0;index<d-nullValue;index++)
				for(index1=0;index1<count;index1++)
			    {
					    decryptionProcess[index1][index]=ciphertext[counter];
					    counter++;
			    }
			for(index=d-nullValue;index<d;index++)
				for(index1=0;index1<count-1;index1++)
				{
					decryptionProcess[index1][index]=ciphertext[counter];
				    counter++;
				}
			
			counter=0;
			for(int a=0;a<decryptionProcess.length;a++ )
				for(int b=0;b<decryptionProcess[a].length;b++)
				{
					plaintext[counter]=decryptionProcess[a][b];
					counter++;
				}
			for(int a=0;a<length;a++)
				ciphertext[a]=plaintext[a];			
		}
		String result = "";
		for(int index=0; index<length;index++)
		{
			result += plaintext[index];
		}
		System.out.print("\nThe plaintext is: "+result);
	}
	
    public static void main(String[] args) 
    {
    	RailFenceCipher test2 = new RailFenceCipher();
    	test2.encryption("123456789", new Key(4,2));
    	test2.decryption("168539724", new Key(4,2));
    }
}

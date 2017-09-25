//Austin Martin 
//Ceaser's cipher text decoder
package bruteForce;

public class bruteForce {

	public static void main(String[] args) {
		String cipher = "tebkfkqebzlropblcerjxkbsbkqp";
		char [] charArr=cipher.toCharArray();
		int len=cipher.length();
		char [] result=new char[len];
	
		
		System.out.println("The cipher text is " + cipher);
		System.out.println("The length of the cipher is " + len);
		System.out.println("Possible decoded text");
	
		for(int x=0; x<=26; x++)
		{
			
			for(int y=0; y<len; y++)
			{
				
				
				char currentChar=charArr[y];
				//System.out.println(currentChar);
				currentChar=(char)(((currentChar-'a'+x)%26)+'a');
				System.out.print(currentChar);
				
			}
			
		System.out.println();
		}
		

	}

}

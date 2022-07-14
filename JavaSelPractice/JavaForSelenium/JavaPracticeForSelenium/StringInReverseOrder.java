package JavaPracticeForSelenium;

public class StringInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Hello Makarand";
		for(int i=0;i<Str.length();i++)
		{
			System.out.println(Str.charAt(i));
		}
		System.out.println("=============================");
		for(int i=Str.length()-1;i>=0;i--)
		{
			System.out.println(Str.charAt(i));
		}
		
		
		

	}

}

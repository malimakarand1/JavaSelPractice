package JavaPracticeForSelenium;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Mali Makarand Lotan");
		//String[] newstr=s.split("Makarand");
//		for(String i:newstr)
//		{
//			System.out.println(i);
//		}
//		System.out.println("----------------------------");
//		System.out.println(newstr[0].strip());
//		System.out.println(newstr[1].strip());
//		System.out.println("----------------------------");
//		System.out.println(newstr[0].charAt(2));
//		System.out.println(newstr[0].indexOf("i"));
		
		//Reverse String logic
		int l=s.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}

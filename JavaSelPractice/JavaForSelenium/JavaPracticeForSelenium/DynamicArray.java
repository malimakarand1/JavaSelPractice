package JavaPracticeForSelenium;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Mali");
		a.add("Makarand");
		a.add("Lotan");
		a.add("Shirpur");
		
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		a.remove(3);
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		

	}

}

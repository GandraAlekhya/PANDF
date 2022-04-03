package ass6;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentSix {
	
	public void Problem1( )
	{
		System.out.println("PROBLEM1");
		String regexpr1 = "^[A-Z]{1}[a-z]{0,7}$";
		String input1 = "Alekhya";
		String input2 = "alekhya";
		Pattern ptrn = Pattern.compile(regexpr1);
        Matcher mtchr1 = ptrn.matcher(input1);
       
        if(mtchr1.find())
           System.out.println("Problem1-Input1 : True");
        else
            System.out.println("Problem1-Input1 : False");
		
        Matcher mtchr2 = ptrn.matcher(input2);
        
        if(mtchr2.find())
           System.out.println("Problem1-Input2 : True");
        else
            System.out.println("Problem1-Input2 : False\n");
        
	}

	public void Problem2()
	{
		System.out.println("PROBLEM2");
		String regexpr2 = "[;.]$";
		String input1 = "Alekhya;";
		String input2 = "sun rises east";
		Pattern ptrn = Pattern.compile(regexpr2);
        Matcher mtchr1 = ptrn.matcher(input1);
        if(mtchr1.find())
            System.out.println("Problem2-Input1 : True");
         else
             System.out.println("Problem2-Input1 : False");
 		
         Matcher mtchr2 = ptrn.matcher(input2);
         
         if(mtchr2.find())
            System.out.println("Problem2-Input2 : True");
         else
             System.out.println("Problem2-Input2 : False\n");
		
	}
	public void Problem3()
	{
		System.out.println("PROBLEM3");
		String regexpr3 = "^(The|A|An).*[;.]$";
		String input1 = "The sun rises in the east.";
		String input2 = "sun rises east";
		Pattern ptrn = Pattern.compile(regexpr3);
        Matcher mtchr1 = ptrn.matcher(input1);
        if(mtchr1.find())
            System.out.println("Problem3-Input1 : True");
         else
             System.out.println("Problem3-Input1 : False");
 		
         Matcher mtchr2 = ptrn.matcher(input2);
         
         if(mtchr2.find())
            System.out.println("Problem3-Input2 : True");
         else
             System.out.println("Problem3-Input2 : False\n");
		 
	}
	public void Problem4()
	{
		System.out.println("PROBLEM4");
		String regexpr4 = "\\bjava\\b";
		String input1 = "java is a programming language java";
		Pattern ptrn = Pattern.compile(regexpr4);
        Matcher mtchr1 = ptrn.matcher(input1);
        if(mtchr1.find())
            System.out.println("Problem4-Input1 : True");
         else
             System.out.println("Problem4-Input1 : False");
     String[] str =  input1.split(" ");
     int n = str.length;
     int count = 0;
     
     for(int i=0;i<n;i++)
     {
    	// System.out.println(str[i]);
    	 if(str[i].equals("java"))
    	 {
    	    count = count + 1 ;
    	 }
     }
        
     System.out.println("Number of word java in String is :" + count);
 		
        
	}
	public static void main(String args[])
	{
		AssignmentSix a = new AssignmentSix();
		a.Problem1();
		a.Problem2();
		a.Problem3();
		a.Problem4();
	}
}

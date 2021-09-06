package testNew;

public class StringSort {
	
	public static void main(String args[])
	
	{
		
   String s1 ="surajGhadage";
   
   char ch[]={'a','u','u','y','t','a'};
   
   String s4=s1.substring(2);
   String s2= new String(ch);
   
   String s3= new String("testString thee");
   
  System.out.println(s1);
  System.out.println(s4);
  
  System.out.println(s3);
  
  String s7= "Suraj" +"Ghadage";
  
  System.out.println(s7);
  System.out.println(s1.equals(s3));
  System.out.println(s1.compareTo(s4));
  
	StringBuffer sb= new StringBuffer("GhadageSuraj");
	System.out.println(sb.replace(1,3,"patil"));
	
  
  StringBuilder T1=new StringBuilder("hello");
  StringBuilder T2=new StringBuilder("test");
  
  StringBuilder T4=T1.append(T2);
  System.out.println(T4);
  System.out.println(T4.toString());
  System.out.println(s7.substring(3,4));
  System.out.println(s7.toUpperCase());
  
  
		}   
		}   
		



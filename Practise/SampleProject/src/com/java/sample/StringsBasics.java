package com.java.sample;

import java.util.Arrays;

public class StringsBasics {

//first convert the given String to Character Array using toCharArray() method. 
		//After that, just iterate the given array in the reverse order
		public static void stringReverse(){
			String str = "TeneTw";
			char chars[] = str.toCharArray();  
			char str2[] = new char[str.length()]; 
			String compare ;
			int j =0;
			for(int i=chars.length-1;i>=0;i--)
			{
			//  System.out.print(chars[i]);
			  str2[j++]=chars[i];
				
			}
			compare=String.valueOf(str2);
			if(str.equals(compare))
			System.out.print(compare);
		}
		
		public static void stringbuilderReverse(){
			String str1 = "Selenium";
			StringBuilder str2 = new StringBuilder();
			str2.append(str1);
			System.out.println(str2	.reverse());
		} 

		// Duplicate chars count and print duplicates from string
		// declare a string, convert to char array and sort the char array and iterate over length of char array and if condition met increase the counter 
		
		public static void printDuplicateChars(){
			String name = "Prashanth";
			char[] ch = name.trim().toCharArray();
			char[] result = new char[ch.length];
			int k = 0;
			Arrays.sort(ch);
			int count =0;
			if(ch.length!=0){
			for(int i=0;i<ch.length-1;i++){
				if(ch[i]==ch[i+1]){
					result[k++] = ch[i];
					count++;
						//break;
			}
			}
			}System.out.println(count);
			System.out.println(result);
			
		}
		
		// method to print duplicate no.s in given array
		
		public static void printDuplicateNumbers(){
			int[] a = {1,2,3,4,5,3,1};
			Arrays.sort(a);
			for(int i=0;i<a.length-1;i++){	
				if(a[i]==a[i+1]){
					System.out.println(a[i]);
				}
				
			}
		}
		

		// method to remove duplicate number from array
		
		public static void removeDuplicateNumbers(){
			int[] a = {1,2,3,3,4,4,5,6,7,8};
			int[] temp = new int[a.length];
			Arrays.sort(a);
			int j=0;
			for(int i=0;i<a.length-1;i++){
				if(a[i]!=a[i+1]){
					temp[j++]=a[i];
				}
			}
			temp[j++]=a[a.length-1];
			for(int k=0;k<j;k++){
			System.out.println(temp[k]);
			}
			
		}
		
	// method to remove duplicate char from string
		
		public static void removeDuplicateChars(){
			String str = "Hello";
			StringBuilder sb = new StringBuilder();
			if(!str.isEmpty()) {
			    char[] chars = str.toCharArray();
			    Arrays.sort(chars);
			    for (int i = 0; i < chars.length-1; i++) {
			        if (chars[i] != chars[i+1]) {
			         sb.append(chars[i]);
			        }
			    }
			}System.out.println(sb);
		}
		
		
	// Count the no. of words in a given string using available methods
		
	public static void wordCount(){
		String s= "Hi prashanth";
		System.out.println(s.trim().split("\\s+").length);
	}


	//Count the no. of words in a given string without using available methods

	public static void words(){
		String str = " welcome to my world ";
		 int count=0;
	     char ch[]= str.toCharArray(); 
	     for(int i=0;i<ch.length;i++)  
	     {  
	        
	    	 if((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')|| ((ch[0]!=' ')&&(i==0))){
	    		 count++; 
	    	 }
	              
	     }  
	    System.out.println(count);  
		}
		

	// give string is palindrome or not 

	private static boolean isPalindrome(String str) {
	    if (str == null)
	        return false;
	    String result = str.toLowerCase();
	    StringBuilder strBuilder = new StringBuilder(result);
	    strBuilder.reverse();
	    return strBuilder.toString().equals(result);
	}

	 
	// occurrence of a number in an array

	public static void repeatedNoCount(){
		int[] arr = {3,5,2,3,1,3,5};
		int[] result = new int[arr.length];
		int visited = -1;  
		for(int i=0;i<arr.length;i++){
			int count = 1;
			for(int j =i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count++;
				result[j] = visited;  
			}
		}
			if(result[i] != visited)  
	            result[i] = count;  
		}
		for(int k=0;k<result.length;k++){
			 if(result[k] != visited) 
			System.out.println(arr[k] +"|"+result[k]);
		}
	}

	//method that will remove given character from the String and compare string

	public static void removeChar(String s, char c){
		String st = "prashanth Kumar";
		char ch[] = new char[st.length()];
		System.out.println(st.equalsIgnoreCase(s));
		System.out.println(st.compareTo(s));
		System.out.println(s.replaceAll(Character.toString(c),""));
		st.getChars(10, 15, ch, 0);
		System.out.println(ch);
	}

	public static void swap(){
		int i = 6;
		int j = 5;
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("after swap i value : "+i+"   and j value :  "+j);
		
	}

	public static void factorial(){
		int j=3;
		int fact=1;
		for(int i=1;i<=j;i++){
			fact=fact*i;
		}System.out.println(fact);
	}


	public static void primeNo(){
		int i =7;
		int m = i/2;
		int flag = 0;
		for(int j=2;j<=m;j++){
			if(i%j==0){
				System.out.println("not a prime number"+i);
				flag++;
				break;
			}
		}if(flag==0){
			System.out.println("prime number"+i);
		}
	}

		public static void main(String[] args) {
			StringsBasics.stringReverse();
		//	StringsBasics.stringbuilderReverse();
		//  StringsBasics.printDuplicateChars();
		//	StringsBasics.printDuplicateNumbers();
		//	StringsBasics.wordCount();
		//  StringsBasics.words();
		//	StringsBasics.removeDuplicateNumbers();
		//	StringsBasics.removeDuplicateChars();
		//  System.out.println(StringsBasics.isPalindrome("Tenet"));
		//  StringsBasics.repeatedNoCount();
		//	StringsBasics.removeChar("prashanthe",'e');
		//	StringsBasics.swap();
		//	StringsBasics.factorial();
			StringsBasics.primeNo();
		}

	}




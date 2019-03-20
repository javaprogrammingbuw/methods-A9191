package method;

import java.util.Scanner;

/*
public class Prime {
	
	
	int inputnum=0;
	
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
			
		
		System.out.print( "Please enter a  number: " );
		int num = input.nextInt();
		if( isprime( num ) ) {
			System.out.println( "Nice - the number is prime!" );
		} else {
			System.out.println( "Ooops - the number is not prime!" );
		}

	}
	
	public static boolean isprime( int inputnum ) {
				if((inputnum != 5)|( inputnum%2 == 0 | inputnum%3 == 0 | inputnum%5 == 0 ) | (inputnum == 0 ) | (inputnum == 1) | (inputnum != 2) | (inputnum != 3)  )
		{
			return false;
		}
	
		else		{
			return true;
		}
	}

}

*/

public class Prime 
{

public static void main(String[] args) 
 {
    Scanner in = new Scanner(System.in);
    int number, i, a = 0;

    System.out.println("Enter a prime number: ");
    number = in.nextInt();

    System.out.println(isprime(number));
 }




public static boolean isprime(int a){
	
	if(a==0){
		return true;
	}
	else if(a<0){
		System.out.println("Wrong range");
		return false;
	}
	
    
	for (int i = 2; i < a; i++)
    {
        if (a % i == 0)
        {
            return false;
        }
    }
	return true;
    }


public int findDoublette(int j){
	boolean b = isprime(j);
	int Max = Integer.MAX_VALUE;
	if (b=true) {
	    System.out.println("Enterd number is not a prime number: ");
	}
	else {
		for( j = 2; j<Max; j++){  
			int x = 0;
			for(int i=2; i<=j/2; i++){  

				if(j%i==0){
					x++;
				}                      
			}
			if(x==0){

	
}
}

	}
	return j;

	}
	
	}	
=======
package methods;

import java.util.Scanner;

//todo: write a method isPrime which tells you if a given number is a prime or not
//then, write another method findDoublette which takes an integer value as input and 
//is looking for the first prime-doublette it findes. A prime-doublette consists of
//two prime values with the difference of 2 (e.g. 3 and 5).
//The function should return the smaller one of the doublette. If there exists no
//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
//the function should return 0.

public class Prime 
{

public static void main(String[] args) 
 {
    Scanner in = new Scanner(System.in);
    int number, i, a = 0;

    System.out.print("Enter a number: ");
    number = in.nextInt();

    System.out.println("is prime -> "+isprime(number));
    System.out.println("first number of prime doublette -> "+findDoublette(number));
    
 }

	public static boolean isprime(int a){	
		if(a==0){
			return true;
		}
		else if(a<0){
			System.out.println("Wrong range");
			return false;
		}  
		for (int i = 2; i < a; i++)
	    {
	        if (a % i == 0)
	        {
	            return false;
	        }
	    }
		return true;
    }

	public static int findDoublette(int doublette) {
		// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		//   x x   x   x        x     x     
		int max = Integer.MAX_VALUE;
		int res = -1;
		for (int i = doublette; i < max ; i++)
		{
			if( isprime(i) && isprime(i+2) ) {		 
				res = i;
				break;
			}			
		}
		
		return res;
	}
}
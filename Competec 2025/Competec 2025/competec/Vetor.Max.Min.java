/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] vetor  = {14,20,32,-4,52,76,27,89,98,160};
	     
	    int max = vetor[vetor.length -1];
	    int min = vetor[0];
	    
	    for ( int i = 0; i < vetor.length; i++){
	        
	        if(vetor[i] > max){
	            max = vetor[i];
	        }
	        if (vetor[i] < min){
	            min = vetor[i];
	        }
	    }
	    System.out.print("MAX: " + max);
	    System.out.print("\n");
	     System.out.print("MIN: " + min);
	    
	    
	}
}

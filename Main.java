/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner Scanner = new
	    Scanner(System.in);
	    int[] nota = new int[10];
	    
	    System.out.print("Digite 10 notas inteiras");
	    for (int i = 0; i <10; i++){
	        System.out.print("Nota" + (i + 1) + ": ");
	        nota [i] = Scanner.nextInt();
	    }
	    Arrays.sort(nota);
	    
	    int soma = 0;
	    for(int i = 1; i<9; i++){
	        
	        soma += nota[i];
	    }
	    int M = soma / 8;
	    
	    System.out.print("Media das 8 notas (sem a maior e a menor)):" + M);
	    
	    if (M>900){
	        System.out.println("ÉEEEEEEEEEEEEEEE CAMPEÃAAAAAAAAAA");
	    }else {
	        System.out.println("Fica para a próxima,fiel");
	    }
	    
	    }
	    }
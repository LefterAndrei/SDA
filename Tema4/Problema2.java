package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

	public static int[] sterge_numar(int n, int poz, int arr[])
    {
        int i =0;
  
        int newarr[] = new int[n -1];
  
      while(i<poz-1)
      {
    	  newarr[i] = arr[i];
    	  i++;
    	  
      }
      if ((i==poz-1) && (i!=9) ) {
    	  newarr[i] = arr[i+1];
    	  i++;
	}
     
    	  
      while(i<n-1)
    	  {	
    	  newarr[i] = arr[i+1];
    	  i++;
    	  }
  
        return newarr;
    }
  
    
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
        int n = 10;
        int arr[]
            = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };
        System.out.println("Lista actuala: " + Arrays.toString(arr));
        
        System.out.println("Introduceti pozitia elementului pe care doriti sa il stergeti: ");
  
        int poz = read.nextInt();
        
        arr = sterge_numar(n, poz, arr);
  
        System.out.println("Noua lista: " + Arrays.toString(arr));
        read.close();
    }
	
}

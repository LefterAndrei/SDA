package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {

	public static int[] adauga_numar(int n, int poz, int arr[], int x)
    {
        int i =0;
  
        int newarr[] = new int[n + 1];
  
      while(i<poz)
      {
    	  newarr[i] = arr[i];
    	  i++;
    	  
      }
      if (i==poz) {
    	  newarr[i] = x;
    	  i++;
	}
      while(i<n+1)
    	  {	
    	  newarr[i] = arr[i-1];
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
        
        System.out.println("Introduceti pozitia unde sa fie adaugat elementul: ");
  
        int poz = read.nextInt();
        System.out.println("Introduceti elementul pe care vreti sa il adaugati: ");
        int x = read.nextInt();
        arr = adauga_numar(n, poz, arr, x);
  
        System.out.println("Noua lista: " + Arrays.toString(arr));
        read.close();
    }
	
}

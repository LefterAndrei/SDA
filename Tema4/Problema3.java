package Tema4;

import java.util.Scanner;

public class Problema3 {

	public static int cautare_binary(int arr[], int x)
	{
		int n = arr.length;
		return binarySearch(arr, 0, n - 1, x);
	}
	
	public static int binarySearch(int arr[], int i, int n, int x)
    {
		
        if (n >= i) {
            int mijl = i + (n - i) / 2;
 
            if (arr[mijl] == x)
                return mijl;
 
            if (arr[mijl] > x)
                return binarySearch(arr, i, mijl - 1, x);
 
            return binarySearch(arr, mijl + 1, n, x);
        }
 
        
        return -1;
    }
 
    
    public static void main(String args[])
    {
    	
    	Scanner read = new Scanner(System.in);
        int arr[] = { 1, 3, 5, 12, 15, 89, 123, 675, 1254};
        
        System.out.println("Introduceti numarul pe care vreti sa il cautati: ");
        int x = read.nextInt();
        int rezultat = cautare_binary(arr, x);
        if (rezultat == -1)
            System.out.println("Elementul nu a fost gasit");
        else
            System.out.println("Elementul a fost gasit la indexul:  " + (rezultat+1));
        
        read.close();
    }
}


package java3;

import java.security.UnresolvedPermission;
import java.util.Arrays;
import java.util.Scanner;

public class Recorsea {

	//דוגמות של ריקורסייות :
	//factorial:
	public static int factorial(int n) {
		if(n<=1) return 1;
		return factorial(n-1)*n;
	}
	// trangle :
	public static void printTrangle(int n) {
		
		if(n==0) return;
		printTrangle(n-1);
		for(int i=0; i<n;i++) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	//power : 
	public static int power(int n,int k) {
		
		if(k==0) return 1;
		return power(n, k-1)*n;
		
	}
	//power odd numbers /even numbers:
	
	public static int power2(int n,int k) {
		
		if(k==0) return 1;
		 int t= power2(n, k/2);
		 if(k%2==0) return(t*t);//even number
		 else  return(t*t*n);// odd number
	}
	
	//fibonaccte:
	public static int fibonaccte(int n) {
		int x0=0,x1=1,temp;
		if(n<=1) return n;
		for(int i=2; i<=n;i++) {
			temp=x0+x1;
			x0=x1;
			x1=temp;
		}
		return x1;
	}
	//recorsea with arrays 
	public static int sumArr(int[ ]arr) {
		if(arr.length==0 )return 0;
		int[] subArr=Arrays.copyOf(arr, arr.length-1);//cope the array in another array
		return sumArr(subArr)+arr[arr.length-1];
		
	}
	
	//helper :
	public static int sumArrHelper(int []arr,int n) {
		
		if(n==0) return 0;
		return sumArrHelper(arr, n-1)+arr[n-1];
	}
	//max 
	public static int max(int[]arr,int n) {
		
		if(n==1) return arr[0];
		int tempMax=max(arr,n-1);
		if(arr[n-1]>tempMax)return arr[n-1];
		else return tempMax;
	}
	//semtric helper:
	public static boolean isSymtricHelper(int[]arr,int left,int right) {

		if(left>=right)return true;
		if(arr[left]!=arr[right]) return false;
		return isSymtricHelper(arr, left+1, right-1);
	}
	//symetric :
	public static boolean isSymtric(int[]arr) {
		return isSymtricHelper(arr,0,arr.length-1);
	}
	//check if symtric of a string  (helper):
	public static boolean isSymtricStringHelper(String str,int left,int right) {
		if(left>=right)return true;
		if(str.charAt(left)!=str.charAt(right)) return false;
		return isSymtricStringHelper(str, left+1, right-1);
		
	}
	//the second part:
	public static boolean isSymtricString(String str){
		return isSymtricStringHelper(str,0,str.length());
		
	}
	
	
	//sub sum:
	
  public static boolean subSetSum(int []arr,int size,int sum) {
	  if (sum==0) return true;
	  if(size==0 || sum<0 ) return false;
	  return subSetSum(arr, size-1, sum-arr[size]) || subSetSum(arr, size-1, sum);
	  
  }
  //benari search helper:
  public static int binarySearchHelper(int arr[],int value,int low ,int hight) {
	  if(low>hight) return 0;//not found
	  
	  int middle= (low+hight)/2;
	  
	  if(value==arr[middle]) return middle;
	  
	  if(value<arr[middle]) return binarySearchHelper(arr, low, middle-1, value);
	  else return binarySearchHelper(arr, middle+1, hight, value);  
  }
  //benari search:
  
  public static int binarySearch(int arr[],int value) {
	  return binarySearchHelper(arr, 0, arr.length-1, value);  
  }  
  //hanoi ;
  public static void hanoi(int n,char src,char dest,char help) {
	  if(n==0) return;
	  
	  hanoi(n-1, src, help, dest);
	  System.out.println("move discs"+n+"from"+src+"to"+dest);
	  hanoi(n-1, help, dest, src);
  }
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int discs;
//		System.out.println("enter the number of discs");
//		discs=s.nextInt();
//		hanoi(discs,"A","B","C");	
	}
 public	static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        
        return (n % 10 + sum_of_digit(n / 10));
    }
public static boolean upper_digits(int n) {
	if(n>10)return true;
	int x=n%10;
	int y=(n/10)%10;
		if(x > y)
		return upper_digits(n/10);
	else
		return false; 
	
}
 
}

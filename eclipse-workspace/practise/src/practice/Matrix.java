package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class A {
	private int a;
	
	private class D{
		public int k() {
			return a;
		}
	}
}
class B extends A {}
	 
public class Matrix{

	public static void main(String args[]){
		//matrixManipulation();
		int k = new Matrix().process();
		System.out.println(k);
		/*
		 * String s="a"; A b = new A(); System.out.println(b instanceof A);
		 */
		//Add(null);
		
	}
	 static void Add(String a) {System.out.println("k");}
	 static void Add(Object a) {System.out.println("k1");}

	public int process() {
		int i = 0;
		try {} catch (Exception e) { i= 200;return i;} finally {
			 i= 300;return i;
		}
		/*
		 * int f1=15; int f2=f1;; for (int i = (f1-1); i > 1; i--) { f2 = f2 * i; }
		 */
		//System.out.println(f2);
		/*
		 * String s="aa,2,true,3"; Scanner sc = new Scanner(s); sc.useDelimiter(",");
		 * int age = sc.nextInt();
		 */
		
	}

	private static void matrixManipulation() {
		int r = 3;
		int c = 4;

		int a[][]=new int[r][c];

		System.out.print(" ****** Enter matrix of " + r + "*" + c + " ****** " );  
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<r;i++) {            
			for(int j=0; j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}

		String str[] = new String[12];
		int p=0;

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(a[i][j] == 0){
					str[p] = i + "-" + j;
					p++;
				}
			}
		}


		for(int k=0;k<str.length;k++){
			if(str[k] != null) {
				int row = Integer.valueOf(str[k].split("-")[0]);
				int col = Integer.valueOf(str[k].split("-")[1]);
				for(int i=0;i<c;i++){
					a[row][i]=0;
				}
				for(int i=0;i<r;i++){
					a[i][col]=0;
				}
			}
		}

		System.out.print(" ****** result ****** " );  
		for(int i=0; i<r;i++) {            
			for(int j=0; j<c;j++){
				System.out.print(a[i][j]);
			}
		}
	}
}


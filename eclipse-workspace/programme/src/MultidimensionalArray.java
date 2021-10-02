
public class MultidimensionalArray {

	public static void main(String[] args) {
		
		 // int a[][] = new int [2][3];
		   //a[0][0]=2;
		    //a[0][1]=4; 
		    //a[0][2]=5;
		    //a[1][0]=3;
		  //a[1][1]=4; 
		  //a[1][2]=7; 
		//System.out.println(a[1][0]);
		 
		int b [][] = {{2,4,5},{3,4,7}};
		//System.out.println(b[0][2]);
		for (int i =0;i<2;i++) //outer loop for row
		{
			for(int j=0;j<3;j++)//inner loop for coloumn
			{
				System.out.println(b[i][j]);
			}
		}
	}

}

package programme.prime;

public class Prime {
      
	public  int checkPrime(int num, int i) {
		 for(i=2;i<=num/2;i++) {
			 if(num%i==0) {
				 System.out.println(" the given no. is not a prime no.");
				 
				break;
			 }
			 else{
				 System.out.println("the given no. is prime");
			 }
		 }
			return num;

}
}
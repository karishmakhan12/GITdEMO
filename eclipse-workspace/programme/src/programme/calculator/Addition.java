package programme.calculator;

public class Addition {
	int z;
	public int addNum(int a, int b,String operator) {
		
		if (operator.equalsIgnoreCase("+")) {
			z= a+b;
		}
		else if(operator.equalsIgnoreCase("-")) {
			z=a-b;
		}
		else if (operator.equalsIgnoreCase("*")) {
			z=a*b;
		}
		else if (operator.equalsIgnoreCase("/")) {
			z=a%b;
		}
		return  z;
		
	}
}

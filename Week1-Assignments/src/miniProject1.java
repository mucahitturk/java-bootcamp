
public class miniProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		boolean isPrime = true;
		for (int i = 2; i < number/2; i++) {
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println(number + " is a prime number.");
		} else {		
			System.out.println(number + " is not prime number.");
		}
		
		
		
	}

}

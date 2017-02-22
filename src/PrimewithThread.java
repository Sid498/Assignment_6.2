import java.util.Scanner;

class Prime extends Thread implements Runnable {
	@Override
	public void run() {
		int Number;
		System.out.println("Enter number to find it is prime or not");
		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		if(Number == 2)
		{
			System.out.println(+Number+" is Prime number");
		}
		else if(Number%2==0)
		{
			System.out.println(+Number+" is not a prime number");
		}
		else
		{
			System.out.println(+Number+" is Prime number");
		}
	}

}

public class PrimewithThread {

	public static void main(String[] args) {
		Prime p = new Prime(); 
		p.run();
	}

}

package pkg1;
public class H10 {
	public static void main(String[] args) {
		System.out.println("Even numbers are:");
		for(int i=0;i<=5;i++)
			System.out.print(i*2+" ");
		System.out.println("\nOdd numbers are:");
		for(int i=0;i<=5;i++)
			System.out.print(i*2+1+" ");
		System.out.print("\n");
		for(int j=3;j<101;j++) {
			for(int i=0;i<=10;i++) {
				System.out.print(i*j+" ");
			}
		}
	}

}

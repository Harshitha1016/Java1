//3
package pkg1;
public class H24{
	static int staticVariable;
	static {
		staticVariable=10;
		System.out.println("static variable value:"+staticVariable);
	}
	public static void main(String[] args) {
		System.out.println("values of static variable in main method:"+staticVariable);
	}
}

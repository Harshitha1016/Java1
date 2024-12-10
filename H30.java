package pkg1;
import pkg2.MyPackage2;
class MyPackage{
    public void display() {
            System.out.println("This msg is from MyPackage class within pkg1");
    }
}
public class H30 {

        public static void main(String[] args) {
                System.out.println("Package");
                MyPackage mypack1=new MyPackage();
                MyPackage2 mypack2=new MyPackage2();
                mypack1.display();
                mypack2.display();
        }
}
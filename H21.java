package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import pkg2.Tools3;
public class H21 {
        public static void reverse2(String fname1, String fname2)throws IOException {
                File f1=new File(fname1);
                FileWriter fw1=new FileWriter(fname2);
                Scanner sc1=new Scanner(f1);
                String name="";
                String name_rev="";
                Tools3 t1=new Tools3();
                while(sc1.hasNext()){
                        name=sc1.nextLine();
                        name_rev=t1.reverse(name);
                        fw1.write(name_rev+"\n");
                        System.out.println(name_rev);
                }
                fw1.close();
                sc1.close();

        }

        public static void main(String[] args) throws IOException {
                        reverse2("names.txt","names_out.txt");
                        reverse2("family.txt","family_out.txt");
        }

}
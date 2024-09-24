class Bank2{
    int getIntrestRate(){
        return 0;
    }
}
class Canara extends Bank2{
    int getIntrestRate(){
        return 5;
    }
}
class SBI extends Bank2{
    int getIntrestRate(){
        return 6;
    }
}
class SCDCC extends Bank2{
    int getIntrestRate (){
        return 8;
    }
}
public class java{
    public static void main(String[] args){
        Canara bank1 =new Canara();
        SBI bank2 = new SBI();
        SCDCC bank3 = new SCDCC();
        System.out.println("Bank1: "+bank1.getIntrestRate()+"%");
        System.out.println("Bank2: "+bank2.getIntrestRate()+"%");
        System.out.println("Bank3: "+bank3.getIntrestRate()+"%");
    }
}
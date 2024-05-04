package abstractClass.developer;

public class Company {
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
    }
}

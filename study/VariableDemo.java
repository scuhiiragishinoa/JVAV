package study;
/**
 * demo.Variable
 */
public class VariableDemo {
    public static void main(String[] args) {
        String Username = "?";
        long Password = 1;
        byte x = 20;
        short y = 500;
        int z = 1000000;
        float a = 1.23F;
        double b = 2.34;
        double c = 3.00;
        char d = '好';
        Username = "shinoa";
        Password = 1234567890123456789L;
        System.out.println(Username);
        System.out.println(Password);
        System.out.println(x + y + z);        
        System.out.println(a + b + z);
        double value = b + x;
        System.out.println(value + d);
        System.out.println(c);
    }
}

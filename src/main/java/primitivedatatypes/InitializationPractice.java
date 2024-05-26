package primitivedatatypes;

public class InitializationPractice {
    public static void main(String[] args) {
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        float f = 127;
        double d = 127;
        boolean isTrue = false;
        long l = 127;

        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(isTrue);

        System.out.println("=================================================");

        long lOne = 127l;
        long lTwo = 127L;

        System.out.println(lOne);
        System.out.println(lTwo);

        //exponential values example
        float fOne = 1.27e02f;

        //HexaDecimal/Octa
        int iOne = 0X007F;
        System.out.println(iOne);

        byte b4 = 0b11111;
        System.out.println(b4);
    }
}

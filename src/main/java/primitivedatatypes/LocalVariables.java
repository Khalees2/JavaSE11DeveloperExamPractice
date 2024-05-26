package primitivedatatypes;

public class LocalVariables {
    static int myIntStatic;
    int classInt;
    public static void main(String[] args) {
        System.out.println(myIntStatic);
        System.out.println(new LocalVariables().classInt);

        int localVariable;
        //System.out.println(localVariable); // We must initialize
        localVariable=127;
        System.out.println(localVariable);

        //It's okay to have uninitialized variables at class level/static variables but local variables must be initialised.
    }
}

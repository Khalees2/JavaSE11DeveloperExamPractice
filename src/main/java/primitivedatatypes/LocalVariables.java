package primitivedatatypes;

public class LocalVariables {
    static int myIntStatic;
    int classInt;
    public static void main(String[] args) {
        System.out.println(myIntStatic);
        System.out.println(new LocalVariables().classInt);


        //It's okay to have uninitialized variables at class level/static variables but local variables must be initialised
        int localVariable;
        //System.out.println(localVariable); // We must initialize
        localVariable=127;
        System.out.println(localVariable);

        //Partial initialisation

        int partialValue;
        boolean myBoolean=true;

        if(myBoolean){
            partialValue = 1;
        }
        //System.out.println(partialValue);// It throws error because compile does not validate the 'true' vlaue inside 'myBoolean' and it thinks value might not have been initialised.
        //Same code works if we have else block because compile knows either if/else block will initialise the value.
        else{
            partialValue = 2;
        }
        System.out.println(partialValue);

        int partialAnother;
        if(true){
            partialAnother=1;
        }
        System.out.println(partialAnother);//Will work because compiler know it will definetely execute if block as we hard coded true.

    }
}

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

        System.out.println("======================================================");

        int switchInt;
        int testInt = 5;
        switch (testInt){
            case 0:
            case 1:
            case 2:
                switchInt = 2;
                break;
            case 3:
            case 4:
            case 5:
                switchInt = 4;
                break;
            default:
                switchInt = 47;
        }
        //System.out.println(switchInt);// Will not work because compiler does not know the value stored inside 'testInt' is 5 and it will get initialised.
        //ADDING a default block in the switch statemtn works because compiler knows for sure default block will execute and it will initialise
        System.out.println(switchInt);


        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);

    }
}

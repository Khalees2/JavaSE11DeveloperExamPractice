import lvti.LvtiExample;

public class VarTest {
    public static void main(String[] args) {
        var lvtiExample = new LvtiExample();
        lvtiExample.setName("Salman");
        System.out.println(lvtiExample);

        //Below are valid scenario
        var i = 1; // i is considered as an int value as we dorectly assigned int literal.

        var myArray = new int[8];// myArray is considered as int array

        var name = lvtiExample.getName(); //name will be String because compiler knows before.

        Object object = null;
        var var = object;

        //Invalid scenario below

        //Can not use var declaration for compound statement
        // var j=0,k=0;

        //Can not use without initialisation
        //var someObject;

        //Can not assign null directly
        //var someNul = null;

        //can not have an array of var
        //var[] newArray = new int[4];

        //Can not have array initializer
        //var myArray = {"a","b"};


    }
}

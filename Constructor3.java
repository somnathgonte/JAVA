//Parametarised constructor.
//This constructor is created by user.
//It has parameter.


public class Constructor3 
{
    Constructor3(int i)                  //Parametarised constructor
    {
        System.out.println(i);
        System.out.println("Parametarised Constructor");
    }
    public static void main(String[] args) 
    {
        Constructor3 cr = new Constructor3(10);       //Object
    }    
}

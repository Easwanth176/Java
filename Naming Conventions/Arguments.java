public class Arguments{
    public static void main(String args[])
    {
        try
        {
            System.out.println(args[0]);
        }
        catch (Exception e)
        {
            System.out.println("some unknown error");
        }
    }
}


// The above code is a simple program that takes a command-line argument and prints it.
// The command-line argument is passed when the program is run.
// The main method takes an array of strings as an argument.
// The first element of the array is printed.
// If there is no element in the array, it will throw an exception.
// The exception is caught and a message is printed.
//
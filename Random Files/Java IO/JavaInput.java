import java.util.Scanner;

class Input()
{
    public static void _input()
    {
        // Initialize Scanner !Make Sure to Include "java.util.Scanner"!
        Scanner scan = new Scanner(System.in);
        // Call [variable name].nextLine() to read the next line as a string
        scan.nextLine();
        // Call [variable name].nextInt() to read the next int entered (32 bit limit)
        scan.nextInt();
        // Call [variable name].nextDouble() to read the next double entered
        scan.nextDouble();
        // Call [variable name].nextFloat() to read the next float entered 
        scan.nextFloat();
        // Call [variable name].nextShort() to read the next short int entered 
        scan.nextShort();
        // And so on for each variable type, just make sure that the library is imported
    }
}
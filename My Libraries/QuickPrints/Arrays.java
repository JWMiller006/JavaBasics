// This prints the array mentioned

// Array of Integers
public static void PrintArrInt(int[] temp)
{
    Arrays.stream(temp)
        .forEach(e->System.out.print(e + " "));
}

// Array of Strings 
public static void PrintArrStr(String[] temp)
{
    Arrays.stream(temp)
        .forEach(e->System.out.print(e + " "));
}

// Array of Doubles
public static void PrintArrDoub(double[] temp)
{
    Arrays.stream(temp)
        .forEach(e->System.out.print(e + " "));
}

// Array of characters
public static void PrintArrChar(char[] temp)
{
    Arrays.stream(temp)
        .forEach(e->System.out.print(e + " "));
}

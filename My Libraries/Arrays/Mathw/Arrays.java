class Arrays
{
    // Totals the array
    public static int arrTot(int[] arrTemp, int arrLen)
    {
        // Totals the array
        // Sets the total to 0 to add to it
        int output = 0;
        // Repeats until all the numbers have been added
        for(int i = 0; i < arrLen; i++)
        {
            output += arrTemp[i];
        }
        // Returns the Sum
        return output;
    }

    // Returns the Product of an array
    public static int arrProd(int[] arrTemp, int arrLen)
    {
        // Totals the array
        // Sets the total to 1 to multiply  it
        int output = 1;
        // Repeats until all the numbers have been added
        for(int i = 0; i < arrLen; i++)
        {
            output *= arrTemp[i];
        }
        // Returns the Product
        return output;
    }
}

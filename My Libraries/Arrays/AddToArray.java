// Adds element to the array specified 

// Integer Array: Needs the current length of the list, the array, and the element
public static int[] add_elementInt(int n, int myarray[], int ele) 
{ 
        int i; 

        int newArray[] = new int[n + 1]; 
    //copy original array into new array
    for (i = 0; i < n; i++) 
            newArray[i] = myarray[i]; 

    //add element to the new array
    newArray[n] = ele; 

    return newArray; 
} 

// String Array: Needs the current length of the list, the array, and the element
public static String[] add_elementString(int n, String myarray[], String ele) 
{ 
        int i; 

        String newArray[] = new String[n + 1]; 
    //copy original array into new array
    for (i = 0; i < n; i++) 
            newArray[i] = myarray[i]; 

    //add element to the new array
    newArray[n] = ele; 

    return newArray; 
} 

// String Array: Needs the current length of the list, the array, and the element
public static double[] add_elementDoub(int n, double myarray[], double ele) 
{ 
        int i; 

        double newArray[] = new double[n + 1]; 
    //copy original array into new array
    for (i = 0; i < n; i++) 
            newArray[i] = myarray[i]; 

    //add element to the new array
    newArray[n] = ele; 

    return newArray; 
} 
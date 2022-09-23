// NOTE: This file is not syntax ready and will not run properly or be able to be called normally

// To initialize a variable, one must first declare variable type followed by the variable name 
/* Variable names must follow certain standards: 
        - Must not start with a number
        - Must not include any space 
        - Must not include any hyphen, bracket, or any special character
*/
/*
    Variable Types (Primitave only): 
        - 'byte': any whole number (up to 8 bits [from -128 to 127])
        - 'short': any whole number (up to 16 bits [from -32768 to 32767])
        - 'int': any whole number (up to 32 bits [from -2147483848 to 2147483847])
        - 'long': any whole number (up to 64 bits [from -9223372036854775808 to 9223372036854775807])
        - 'double': any number (including decimals; up to 64 bits)
        - 'char': any single character (including escape characters)
    Variable Types (Non-Primative): 
        - 'String': any collection of character (up to 32 bits [2147483647 characters])
        - 'Class': a user defined data type that is used to create objects  containing  
            a set of properties or methods
        - 'Object': a variable of a class which one can access the member functions and 
            variables of that class, which consists of a state, an identity, and a behaviour
        - 'Array': a collection of a specified data type 
        - 'Interface': similar to a class, but can have both variables and functions
*/

byte demoByte = 120;
short demoShort = 320;
int demoInt = 924;
long demoLong = -9813;
double demoDouble = 90.08;
char demoChar = '\n'; 

String demoString = "This is a string"; 
// Array Examples: 
String demoStrArr[] = {"This ", "is ", "an array"}; // NOTE: For arranging and editing arrays, import 'java.util.Arrays'
double demoDouArr[] = {12.932, 90.0913, 81.092};
char demoCharArr[] = {'c', 'h', 'a', 'r', '\t'}; 
// The other types are in other subsequent files


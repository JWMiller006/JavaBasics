class Loops()
{
    /*
        'for' loops are iterative statements that are used to repeat sets of
        code over and over again, typically for a set amount of iterations.  
        They are good for printing repeatedly, comparing a user's input through
        a list, and other repetitive simple iterative types of functions. 
        'for' loops are different than while loops in that their count/check
        variable is defined when the 'for' statement is called.  This 
        allows for a new local variable to be called in different situations
        as long as that variable is not alredy in use.  This does mean, 
        however, that you cann't directly access the count variable outside
        of the loop itself.  
    */

    // Note that the method calls for an interger 
    // This interger is the number of times that the 
    // Loop executes
    static void forLoops (int loopNum)
    {
        /* Basic syntax is the keyword 'for' followed by parenthases followed by brackets
              Inside the parenthases, you must have the following: 
                 - The declaration of a count variable
                 - The condition check 
                 - The action used to change the count variable
              Inside the brackets is what is repeated, though 
              NOTE that it is not a good practice to declare variables
              inside of the brackets, since it will most likely exit 
              wiht an error message
              Also note that spacing isn't critical, just helpful to help trace
    */
        for (int i = 0; i < loopNum; i++)
        {
            // This Loop will repeat the number of times that is input into the forLoops Method
            System.out.println("This loop has repeated " + i + " times");
        }
    }
}
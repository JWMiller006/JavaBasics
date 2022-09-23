class Loops () 
{
    /*
        'while' loops are a good way to modify a variable, read files, user input,
        and other variable data editing that is repetitive or in some form of a 
        pattern for an unkown (at the writing of the program) number of iterations.
        These loops are different from 'for' loops in that they must have a count
        or check variable initialized and defined before the start of the loop. 
        This does create a little more work, but allows for the data of the 
        variable to be stored after the completion of the loop.  
    */

    // This first method displays how to have a for loop structre just as a 'while' loop
    // Note that the method requires an interger for the number of times that the loop executes
    static void whileLoops_1 (int loopNum)
    {
        // NOTE: You must define a count variable outside of the loop first
        int countVar = 0;
        /*
            General Syntax is as follows: 
                - 'while' keyword 
                - Parenthases [includes the following] 
                    - Check Condition, must be a Conditional Statment that returns
                        'true' or 'false'
                - Brackets
                    - This is the section that gets repeated
                    - NOTE: You also must include a modifier to the check variable
        */
        while (countVar < loopNum)
        {
            // Loops the amount of time that is entered into the method
            System.out.println("Iteration Number " + countVar + " of " + loopNum);
            // NOTE: It is very important that you modify the check variable 
            //  inside of the loop itself so that it does not become an infinite loop
            countVar++;
        }
    }
}

#--------------------------------------------------------
#           PYTHON PROGRAM
# Here is where we are going to define our set of...
# - Imports
# - Global Variables
# - Functions
# ...to achieve the functionality required.
# When executing > python 'this_file'.py in a terminal,
# the Python interpreter will load our program,
# but it will execute nothing yet.
#--------------------------------------------------------

#-----------------------
# Global Variables
#-----------------------
a = 2

#------------------------------
# FUNCTION my_function
#------------------------------
def my_function():
    # 1. We access to the global variable
    if (a > 1):
        print("A")

    # 2. If we try to use a non-declared variables, the program fails
    #if (b > 1):
    #    print("B")

    # 3. If we declare b first, then we can use it inside the function
    c = 3
    if (c > 1):
        print("C")

    # 4. What we declare inside a loop statement is also accessible outside from it
    for var in range(5):
        d = 8
    print(d)

#---------------------------------------------------------------
#           PYTHON EXECUTION
# This is the main entry point to the execution of our program.
# It provides a call to the 'main function' defined in our
# Python program, making the Python interpreter to trigger
# its execution.
#---------------------------------------------------------------
if __name__ == '__main__':
    # 1. We call to my_function
    my_function()

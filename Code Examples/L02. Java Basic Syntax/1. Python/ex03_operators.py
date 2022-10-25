
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

#----------------------------
# FUNCTION my_function
#----------------------------
def my_function():
    # 1. Example of an arithmetic operator
    x1 = 6 + 3
    x2 = 6 / 3

    # 2. Example of a relational operator
    y1 = (6 == 3)
    y2 = (6 >= 3)

    # 3. Example of a logical operator
    z1 = 6 > 0 and 0 > 2
    z2 = not 6 > 5

    # 4. Example of an assignment operator
    t1 = x2
    t2 = t1 + 1

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

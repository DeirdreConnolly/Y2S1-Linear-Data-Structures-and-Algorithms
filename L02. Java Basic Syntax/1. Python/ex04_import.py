
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

#------------------------------
# IMPORTS
#------------------------------
import math
import sys

#------------------------------
# FUNCTION my_function
#------------------------------
def my_function(x):
    # 1. Turn the value into an integer
    value = int(x)

    # 2. Compute the logarithm
    result = math.log(value, 10)

    # 3. Print the result
    print(result)

#---------------------------------------------------------------
#           PYTHON EXECUTION
# This is the main entry point to the execution of our program.
# It provides a call to the 'main function' defined in our
# Python program, making the Python interpreter to trigger
# its execution.
#---------------------------------------------------------------
if __name__ == '__main__':
    # 1. We collect the argument
    x = sys.argv[1]

    # 2. We call to my_function
    my_function(x)


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

import random

#---------------------------
# FUNCTION print_plus_one
#---------------------------
# It receives one input parameter but compute no output result
def print_plus_one(value):
    # 1. We use the input parameter
    my_var = value + 1

    # 2. We do not return anything, just print the value of my_var
    print(my_var)

# ---------------------------
# FUNCTION my_generate
# ---------------------------
# It receives no input parameters but computes one output result
def my_generate():
    # 1. We create the output variable to return
    res = random.randint(0,1)

    # 2. We return res
    return res

#---------------------------
# FUNCTION my_add
#---------------------------
# It receives two input parameters and compute one output result
def my_add(x, y):
    # 1. We create the output variable to return
    res = 0

    # 2. We use the input parameters to compute the value of res
    res = x + y

    # 3. We return res
    return res

# ---------------------------
# FUNCTION my_function
# ---------------------------
# It receives no input parameters and computes no output result
def my_function():
    # 1. We generate two random numbers
    num1 = my_generate()
    num2 = my_generate()

    # 2. We add them
    new_num = my_add(num1, num2)

    # 3. We print the result + 1
    print_plus_one(new_num)

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



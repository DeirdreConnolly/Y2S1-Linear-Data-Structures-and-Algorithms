
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
# FUNCTION my_function
#-----------------------
def my_function():
    # 1. We provide an if example
    a = 2
    if (a > 1):
        print("1")

    # 2. We provide an if-then-else example
    b = 2
    if (b < 1):
        print("2A")
    else:
        print("2B")

    # 3. We provide a nested if example
    c = 1
    if (c > 2):
        if (c > 3):
            print("3A")
        else:
            print("3B")
    else:
        if (c > 1):
            print("3C")
        else:
            print("3D")


    # 4. We provide a while example
    d = 5
    while (d > 0):
        print("D", end='')
        d = d - 1
    print()

    # 5. We provide a for example
    e = 7
    for i in range(e):
        print("E", end='')
    print()

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


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

#---------------------------
# FUNCTION my_function
#---------------------------
def my_function():
    # 1. Print a message by the standard output
    print('Hello World!')

    # 2. We can print the value of a variable
    x = 3
    print(x)

    # 3. We can print to a file
    f = open('my_file.txt', 'w')
    print("Hello, now I'm printing to a file from Python", file=f)
    f.close()

    # 4. We can ask users for some input and print it later.
    my_text = input("Please enter something: ")
    print("You entered", my_text)

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

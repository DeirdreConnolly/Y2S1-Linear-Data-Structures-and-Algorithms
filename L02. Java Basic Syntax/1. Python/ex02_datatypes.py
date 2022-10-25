
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
    # 1. We assign a to an integer value
    a = 3

    # 2. We assign b to an float value
    b = 3.5

    # 3. We assign c to a Boolean value
    c = True

    # 4. We assign d to an String value
    d = "Hello"

    # 5. We assign e to a list of integer values
    e = [1,2,3]

    # 6. We assign f to a tuple of a pair of values, the first one a float and the second one a Boolean
    f = (3.5, True)

    # 7. We assign g to a dictionary or hash table with three entries: 'Name', assigned to a String value; 'Age', assigned to an integer value; 'Goals', assigned to an integer value.
    g = {'Name': "Messi",
         'Age': 29,
         'Goals': 500}

    # 8. Due to dynamic typing, we can change the datatype of a variable
    a = "Hello"

    # 9. Due to strong typing, a value does not magically change its datatype
    d = "123"
    #new_var = d + 5
    new_var = int(d) + 5

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

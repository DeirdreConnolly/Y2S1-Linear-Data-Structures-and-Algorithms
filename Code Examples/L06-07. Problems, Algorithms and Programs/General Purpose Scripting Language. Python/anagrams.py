
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

import sys

#--------------------------------------------------
# initialise_array
#--------------------------------------------------
def initialise_array(num):
    l = []
    while num > 0:
        l.append(num % 10)
        num = num / 10

    i = 0
    j = len(l)-1
    while i < j:
        temp = l[i]
        l[i] = l[j]
        l[j] = temp
        i = i + 1
        j = j - 1

    return l

#--------------------------------------------------
# bubble_sort
#--------------------------------------------------
def bubble_sort(l):
    for i in range(0, len(l)-1):
        for j in range(0, len(l)-1-i):
            if l[j] > l[j + 1]:
                temp = l[j]
                l[j] = l[j + 1]
                l[j + 1] = temp

#--------------------------------------------------
# comp
#--------------------------------------------------
def are_equal(l1, l2):
    res = True
    i = 0
    while i < len(l1) and res == True:
        if l1[i] != l2[i]:
            res = False
        else:
            i = i+1

    return res

#--------------------------------------------------
# anagrams2
#--------------------------------------------------
def anagrams2(l1, l2):
    bubble_sort(l1)
    bubble_sort(l2)

    res = are_equal(l1, l2)

    return res

#---------------------------------------------------------------
#           PYTHON EXECUTION
# This is the main entry point to the execution of our program.
# It provides a call to the 'main function' defined in our
# Python program, making the Python interpreter to trigger
# its execution.
#---------------------------------------------------------------
if __name__ == '__main__':
    #Get the input numbers to arrays
    num1 = [1,2,3,6]
    num2 = [5,3,2,1]

    #Call to alg_n2
    r = anagrams2(num1, num2)

    #Show the result to the user
    print(r)

#anagrams.py 34765 76345
#anagrams.py 55667 66885


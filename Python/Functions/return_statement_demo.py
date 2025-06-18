# Demonstrating return statement in Python

def returnFactorial(n):
    if(n<0):
        return -1
    elif(n==0 or n==1):
        return 1
    else:
        fact = 1
        for i in range(2, n + 1):
            fact *= i
        return fact
    
number= int(input("Enter a number to find its factorial: "))
result = returnFactorial(number)
if result == -1:
    print("Factorial is not defined for negative numbers.")
else:
    print(f"The factorial of {number} is {result}.")
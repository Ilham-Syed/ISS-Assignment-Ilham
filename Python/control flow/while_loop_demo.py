#demonstrating a while loop in Python

# printing numbers from 1 to 10 using a while loop
num = 1
while num <= 10:
    if num % 2 == 0:
        print(f"{num} is even")
    else:
        print(f"{num} is odd")
    num += 1
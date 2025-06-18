#Demonstrating the use of break and continue statements in Python

#Printing numbers from 1 to 10, skipping even numbers and breaking on 7
for i in range(1, 11):
    if i % 2 == 0:
        continue  # Skip even numbers
    if i == 7:
        break  # Break the loop when i is 7
    print(f"Current number: {i}")
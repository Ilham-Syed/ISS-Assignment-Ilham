# Using *args to pass variable-length arguments

def sum_numbers(*nums):
    sum=0
    for num in nums:
        sum += num
    return sum

print(sum_numbers(1, 2, 3))
print(sum_numbers(1, 2, 3, 4, 5))


# Using **kwargs to pass variable-length keyword arguments
def intro(**data):
    print("\nData type of argument:",type(data))

    for key, value in data.items():
        print("{} is {}".format(key,value))

intro(Firstname="Sita", Lastname="Sharma", Age=22, Phone=1234567890)
intro(Firstname="John", Lastname="Wood", Email="johnwood@nomail.com", Country="Germany", Age=25, Phone=9876543210)
#demonstrating type conversion in Python

# converting string to integer
string_num = "123"
int_num = int(string_num)
print(f"String to Integer: {int_num} (Type: {type(int_num)})")

# converting integer to string
int_num = 456
string_num = str(int_num)
print(f"Integer to String: {string_num} (Type: {type(string_num)})")

# converting string to float
string_float = "3.14"
float_num = float(string_float)
print(f"String to Float: {float_num} (Type: {type(float_num)})")

# converting float to string
float_num = 2.718
string_float = str(float_num)
print(f"Float to String: {string_float} (Type: {type(string_float)})")

# converting integer to float
int_num = 42
float_num = float(int_num)
print(f"Integer to Float: {float_num} (Type: {type(float_num)})")

# converting float to integer
float_num = 9.99
int_num = int(float_num)
print(f"Float to Integer: {int_num} (Type: {type(int_num)})")

# converting string to complex
string_complex = "1+2j"
complex_num = complex(string_complex)
print(f"String to Complex: {complex_num} (Type: {type(complex_num)})")
print("Table start")
num = 10
i=1 #you haven't initialized this variable
while i <=num:
    j=1
    while j <= num:
        product = i*j #updated
        print(i, " * ", j, " = ", product) #updated
        j = j + 1
    i = i + 1
print("End of table")
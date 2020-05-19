n=int(input())
def factor(n):
    list = []
    for i in range(1, n + 1):
        if (n % i == 0):
            list = list + [i]
    return list
print(factor(n))
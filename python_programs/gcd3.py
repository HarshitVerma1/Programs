def gcd(m,n):
    i=min(m,n)
    while(i>0):
        if (m % i == 0 & n % i == 0):
            return i
        else:
            i=i-1
print("GCD is : $$ ",gcd(18,3))
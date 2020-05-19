def gcd(m,n):
    cf=[]
    for i in range(1,min(m,n)+1):
        if(m%i==0 & n%i==0):
           cf.append(i) 

    print("Common Factor Is :  ",cf)
    return(cf[-1])
print("GCD is : ",gcd(79,5))
print("GCD is : ",gcd(18,12))

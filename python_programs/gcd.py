def gcd(m,n):
    fm=[]
    for i in range(1,m+1):
        if(m%i==0):
            fm.append(i)
    print("Factor of M is : ",fm)
    fn=[]
    for j in range(1,n+1):
        if(n%j==0):
            fn.append(j)
    print("Factor of N is :",fn)
    cf=[]
    for k in fm:
        if k in fn:
            cf.append(k)
    print("Common Factor Is :  ",cf)
    return(cf[-1])
print("GCD is : ",gcd(79,5))
print("GCD is : ",gcd(18,12))

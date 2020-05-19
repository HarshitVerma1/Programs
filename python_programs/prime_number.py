n=int(input())
def factor(n):
    fn=[]
    for i in range(1,n+1):
        if(n%i==0):
            fn=fn+[i]
    return(fn)
print("Factors of ",n ," is :",factor(n))
def is_prime(n):
    if (factor(n)==[1,n]):
        return ("a prime number")
    else:
        return ("not a prime number")
print(n,"is ",is_prime(n))
def upto_prime_numbers(n):
    prime_list=[]
    for i in range(1,n+1):
        if i>1:
            for j in range(2,i):
                if i%j==0:
                    break
            else:
                prime_list = prime_list+[i]
    return prime_list
print("your prime list ","(till ",n," ) is : ",upto_prime_numbers(n))
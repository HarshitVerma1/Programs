a=[] #1461878
C=0
count=0
def generateNext(d,num):
    a.append(num)
    while(num<10.00):
        num+=d
        a.append(num)
C=float(input("Please input the starting for your series"))
s=float(input("Please input the d for your series"))
generateNext(s,C)
print("The series produced by this method is\n")
for x in range(0,10):
    print(a[x],",")



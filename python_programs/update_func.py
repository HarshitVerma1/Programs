l=[23,45,65,78,55,33,64,78,43]
def update_list(l,i,v):
    if(i>=0 and i<len(l)):
        l[i]=v
        return(True)
    else:
        return (False)
print("List is",l)
print(update_list(l,3,999))
print("updated list is : ",l)
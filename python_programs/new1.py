#age=int(input("How are you old  ??\n"))
#if(age>18):
 #   print("\nGo get your beer!!\n")
#else:
  #  print("\nSorry !!! you're too small to drink beer\n")
word = input("Enter word \n")
if len(word) < 3 :
    print(word[:])
elif len(word) >= 3 :
        if word.endswith("ing"):
            print (word[:-3] + "ly")
        else:
           print (word[:] + "ing")
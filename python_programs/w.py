word = input("Enter word \n")
if len(word) < 3 :
    print(word[:])
elif len(word) >= 3 :
        if word.endswith("ing"):
            print (word[:-3] + "ly")
        else:
           print (word[:] + "ing")
f = open("a.txt", "r")
sum = 0
i = 0
for s in f:
 i+=1
 #s = f.readline()
 s = s[:-1]
 lst = s.split(" ")
 dict = {}
 for index in range(len(lst)):
   val = 1;
   
   if lst[index] in dict :
      val = dict[lst[index]] +1
      dict[lst[index]] = val
      
   else : dict[lst[index]] = 1
 print (dict)
 for key in dict:
    if (dict[key] > 1) : 
      sum+=1
      print (key,dict[key])
      break
print (i-sum,i,sum)

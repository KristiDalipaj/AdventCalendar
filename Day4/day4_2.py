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
   data = "".join(sorted(lst[index]))
   if data in dict :
      val = dict[data] +1
      dict[data] = val
      
   else : dict[data] = 1
 print (dict)
 for key in dict:
    if (dict[key] > 1) : 
      sum+=1
      print (key,dict[key])
      break
print (i-sum,i,sum)

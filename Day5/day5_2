fi = open("a.txt","r")
intList =fi.read().split("\n")
print (intList)
index = 0
steps = 0
while index < len(intList):
  steps +=1
  mom = index
  index = int(intList[index]) + index
  val = int(intList[mom])
  if val >= 3 : val-=1
  else :val+=1
  intList[mom] = str(val)
print (steps)

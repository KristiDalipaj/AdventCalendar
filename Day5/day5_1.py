fi = open("a.txt","r")
intList =fi.read().split("\n")
print (intList)
index = 0
steps = 0
while index < len(intList):

  steps +=1
  mom = index
  index = int(intList[index]) + index
  intList[mom] = str(int(intList[mom])+1)
print (steps)

fo = file("a.txt","r")
a = fo.read()
A = list(a);
min = 10000
max = 0
momData = ""
checkSum = 0
print A
for i in A:
  
  if i == "\t" or i == " " or i == "\r":
    val = int(momData)
    if (val > max) : max = val
    if (val < min) : min = val
    momData = ""
  elif i == "\n":
    checkSum = (max-min) + checkSum
    print max-min
    min = 10000
    max = 0
  else:
    momData = momData + i
val = int(momData)
if (val > max) : max = val
if (val < min) : min = val
checkSum = (max-min) + checkSum    
print max-min
print checkSum
  

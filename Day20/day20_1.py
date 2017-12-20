import string
def cor (pos0,posv0,posa0,t):
  k = (1+t)*t/2
  return int(pos0) + int(t) * int(posv0) + int(k)*int (posa0)
  
def proc (data):
  data = string.replace(data,"p=<","")
  data = string.replace(data,"v=<","")
  data = string.replace(data,"a=<","")
  data = string.replace(data,">","")
  lst = data.split(",")
  return lst

fo = file("a.txt","r")
data = fo.readlines()
minDis = 10000000
minDisind = -1
index = 0
for line in data:
  
  Line = proc(line)
  x = cor(int(Line[0]),int(Line[3]),int(Line[6]),1000)
  y = cor(int(Line[1]),int(Line[4]),int(Line[7]),1000)
  z = cor(int(Line[2]),int(Line[5]),int(Line[8]),1000)
  print x,y,z
  totDis = abs(x-0) + abs(y-0) + abs(z-0)
  if totDis < minDis:
    minDis = totDis
    minDisind = index
  index+=1
print minDisind,minDis

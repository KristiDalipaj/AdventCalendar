fo = file("a.txt","r")
a = fo.read()
print a
A = list(a);
sum = 0
last = len(A)
for index in range(len(A)):
  if A[index] == A[(index+ 1)%(last)]:
    sum += int(A[index])


print sum
  

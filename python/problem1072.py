n = int(input())
I = 0
In = 0
Out = 0
while I < n:
    x = int(input())
    if x >= 10 and x <= 20:
        In += 1
    else: 
        Out += 1
    I += 1
print('%d in' % In)
print('%d out' % Out)

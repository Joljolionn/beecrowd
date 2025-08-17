n = int(input())

fib = [0, 1]
I = 1 

while I < n-1:
    fib.append(fib[I] + fib[I-1])
    I += 1

II = 0
while II < n:
    if II == n-1:
        print(fib[II])
    else:
        print(fib[II], end=' ')
    II += 1

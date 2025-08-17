def fibonacci(n):
    if n == 1:
        return 1
    if n == 0:
        return 0
    
    a, b, count = 0, 1, 2
    
    while count <= n:
        a, b = b, a+b
        count += 1
    return b

n = int(input())
I = 0

while I < n:
    x = int(input())
    print('Fib(%d) = %d' % (x, fibonacci(x)))
    I += 1

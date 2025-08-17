n = int(input())
I = 0
while I < n:
    a, b = map(int, input().split())
    x = 0
    if b > a:
        a += 1
        while a < b:
            if (a % 2) != 0:
                x += a
            a += 1
    else:
        b += 1
        while b < a:
            if (b % 2) != 0:
                x += b
            b += 1
    print(x)
    I += 1

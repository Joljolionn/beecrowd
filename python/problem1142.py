n = int(input())
I = 1
while (I/4) <= n:
    if (I % 4) == 0:
        print('PUM')
    else:
        print(I, end=' ')
    I += 1

n = int(input())
I = 0

while I < n:
    x, y = map(int, input().split())
    if y == 0:
        print('divisao impossivel')
    else:
        result = x / y
        print('%.1f' % result)
    I += 1

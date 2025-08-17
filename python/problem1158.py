n = int(input())
I = 0

while I < n:
    
    x, y = map(int, input().split())
    II = 0
    III = 0
    summ = 0

    while II < y:
        if ((x+III) % 2) != 0:
            summ += x+III
            II += 1
        III += 1

    print(summ)
    I += 1

while True:
    x = int(input())
    
    if x == 0:
        break

    I = 0
    II = 0
    summ = 0
    while I < 5:
        if ((x+II) % 2) == 0:
            summ += (x+II)
            I += 1
        II += 1
    
    print(summ)

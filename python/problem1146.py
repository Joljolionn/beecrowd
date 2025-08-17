while True:
    x = int(input())
    I = 1
    while I <= x:
        if I == x:
            print(I)
        else:
            print(I, end=' ')
        I += 1
    if x == 0:
        break

n = int(input())
I = 1

while I <= n:
    II = 1
    while II <= 3:
        if II == 3:
            print(I**II)
        else:
            print(I**II, end=' ')
        II += 1
    II = 1
    while II < 3:
        if II == 2:
            print((I**II) + 1, end=' ')
        elif II == 1:
            print(I**II, end=' ')
        else:
            print((I**II) + 1)
        II += 1
    print((I**3) + 1)
    I += 1


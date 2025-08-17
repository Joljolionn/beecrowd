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
    I += 1

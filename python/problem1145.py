x, y = map(int, input().split())



I = 1
II = 1
while I <= y:
    

    if II < x:
        print(I, end=' ')
        II += 1
    else:
        II = 1 
        print(I, end='\n')

    I += 1

n = int(input())
I = 0

while I < n:
        
    pa, pb, ga, gb = map(float, input().split())
    ga /= 100
    gb /= 100
    II = 0
    while II <= 100:
        if pa > pb:
            break
        pa = int(pa * ( 1 + ga))
        pb = int(pb * ( 1 + gb))
        
        II += 1
    if II > 100:
        print('Mais de 1 seculo.')
    else:
        print('%d anos.' % II)
    I += 1

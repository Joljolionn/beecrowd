M=[]
I = 0
l = int(input())
operator = input()
while I < 12:
    II = 0
    line = []
    while II < 12:

        line.append(float(input()))
        II += 1

    M.append(line)

    I += 1

III = 0
summ = 0
while III < 12:
    summ += M[l][III]
    III += 1

if operator == 'M':
    summ /= 12

print('%.1f' % summ)

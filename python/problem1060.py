I = 0
positivos = 0
while I < 6:
    x = float(input())
    if x > 0:
        positivos += 1
    I += 1
print('%d valores positivos' % positivos)

I = 0
positivos = 0
media = 0
while I < 6:
    x = float(input())
    if x > 0:
        positivos += 1
        media += x
    I += 1
print('%d valores positivos' % positivos)
print('%.1f' % (media / positivos))

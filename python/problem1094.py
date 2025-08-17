n = int(input())
I = 0
total = 0
coelhos = 0
ratos = 0
sapos = 0
while I < n:
    qnt, tipo = input().split()
    qnt = int(qnt)
    total += qnt
    if tipo == 'C':
        coelhos += qnt
    elif tipo == 'R':
        ratos += qnt
    elif tipo == 'S':
        sapos += qnt
    I += 1
print('Total: %d cobaias' % total)
print('Total de coelhos: %d' % coelhos)
print('Total de ratos: %d' % ratos)
print('Total de sapos: %d' % sapos)
coelhos = (coelhos / total) * 100
ratos = (ratos / total) * 100
sapos = (sapos / total) * 100

print(f'Percentual de coelhos: {coelhos:.2f} %')
print(f'Percentual de ratos: {ratos:.2f} %')
print(f'Percentual de sapos: {sapos:.2f} %')

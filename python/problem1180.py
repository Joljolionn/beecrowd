n = int(input())
x = list(map(int, input().split()))
I = 0
least = [x[I], 0]
while I < n:
    if x[I] < least[0]:
        least = [x[I], I]
    I += 1

print('Menor valor: %d' % least[0])
print('Posicao: %d' % least[1])

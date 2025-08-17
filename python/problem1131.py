inter = 0
gremio = 0
empate = 0
jogos = 0
while True:
    jogos += 1
    x, y = map(int, input().split())
    if x > y:
        inter += 1
    elif x < y:
        gremio += 1
    else:
        empate += 1
    print('Novo grenal (1-sim 2-nao)')
    choice = int(input())
    if choice != 1:
        break

print('%d grenais' % jogos)
print(f'Inter:{inter}')
print(f'Gremio:{gremio}')
print(f'Empates:{empate}')
if inter > gremio:
    print('Inter venceu mais')
elif gremio > inter:
    print('Gremio venceu mais')
else:
    print('Não houve vencedor')

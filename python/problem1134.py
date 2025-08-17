alc = 0
gas = 0
die = 0
while True:
    x = int(input())
    
    if x == 1:
        alc += 1
    elif x == 2:
        gas += 1
    elif x == 3:
        die += 1
    elif x == 4:
        break

print('MUITO OBRIGADO')
print('Alcool: %d' % alc)
print('Gasolina: %d' % gas)
print('Diesel: %d' % die)

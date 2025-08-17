# Então o valor de imposto vai ter que ser baseado no quanto ele tá acima do negócio

# os limites são 2000, 3000, 4500 e acima
# ele n taxa nada até 2000, mas


x = float(input())

tax = 0

while True:
    if x > 4500:
        y = x - 4500
        tax += y * 0.28
        x -= y
    elif x > 3000 and x <= 4500:
        y = x - 3000
        tax += y * 0.18
        x -= y
    elif x > 2000 and x <= 3000:
        y = x - 2000
        tax += y * 0.08
        x -= y
    else:
        break
if tax == 0:
    print('Isento')
else:
    print('R$ %.2f' % tax)

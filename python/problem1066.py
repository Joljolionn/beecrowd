par = 0
impar = 0
positivo = 0
negativo = 0
I = 0

while I < 5:
    x = int(input())
    if x > 0:
        positivo += 1
    elif x < 0:
        negativo += 1
    
    if (x % 2) == 0:
        par += 1
    else: 
        impar += 1
    I += 1
print('%d valor(es) par(es)' % par)
print('%d valor(es) impar(es)' % impar)
print('%d valor(es) positivo(s)' % positivo)
print('%d valor(es) negativo(s)' % negativo)

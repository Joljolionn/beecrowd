def limparArray(array, nome):
    for indice,x in enumerate(array):
        print('%s[%d] = %d' % (nome, indice, x))
    array.clear()

par = []
impar = []
I = 0

while I < 15:
    x = int(input())
    if (x % 2) == 0:
        if len(par) == 5:
            limparArray(par, 'par')
        par.append(x)
    else:
        if len(impar) == 5:
            limparArray(impar, 'impar')
        impar.append(x)
    I += 1
limparArray(impar, 'impar')
limparArray(par, 'par')

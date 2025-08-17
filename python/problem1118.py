choice = 1
while choice == 1:
    I = 0
    nota = 0
    while I < 2:
        x = float(input())
        if x < 0 or x > 10:
            print('nota invalida')
        else:
            nota += x
            I += 1
    media = nota/2
    print('media = %.2f' % media)
    while True:
        print('novo calculo (1-sim 2-nao)')
        choice = int(input())
        if choice == 1 or choice == 2:
            break

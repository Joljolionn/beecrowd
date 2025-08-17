x = float(input())
I = 0
N = 100*[0]

while I < 100:
    N[I] = x
    print('N[%d] = %.4f' % (I, x))
    x /= 2
    I += 1

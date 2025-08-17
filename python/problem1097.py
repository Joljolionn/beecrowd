I = 1
J = 7
II = 1
while I < 10:
    print(f'I={I} J={J}')
    if II == 3:
        J += 4
        I += 2
        II = 1
    else:
        II += 1
        J -= 1

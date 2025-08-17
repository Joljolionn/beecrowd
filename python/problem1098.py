I = 0
J = 1
II = 1
while I <= 2:
    print(f'I={I:.1f}'.rstrip('0').rstrip('.') + f' J={J:.1f}'.rstrip('0').rstrip('.'))
    if II == 3:
        J -= 2
        J += 0.2
        I += 0.2
        II = 1
    else:
        II += 1
        J += 1

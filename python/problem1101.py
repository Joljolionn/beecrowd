while True:
    x, y = map(int, input().split())
    z = []
    total = 0
    if x <= 0 or y <= 0:
        break
    if x > y:
        y, x = x, y
    while x <= y:
        total += x
        print(x, end=' ')
        if x == y:
            print(f'Sum={total}')
        x += 1

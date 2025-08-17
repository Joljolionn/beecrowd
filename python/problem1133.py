x = int(input())
y = int(input())

if x > y:
    x, y = y, x

x += 1

while x < y:
    if (x % 5) == 2 or (x % 5) == 3:
        print(x)
    x += 1

x = int(input())
y = int(input())

if x > y:
    x, y = y, x

total = 0

while x <= y:
    if (x % 13) != 0:
        total += x
    x += 1

print(total)

x = int(input())
z = int(input())
while z <= x:
    z = int(input())

I = 1
summ = x

while summ < z:
    summ += (x+I)
    I += 1

print(I)

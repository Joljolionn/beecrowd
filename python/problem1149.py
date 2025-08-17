arr = list(map(int, input().split()))

a = arr[0]
n = arr[-1]
summ = 0
I = 0
while I < n:
    summ += (a+I)
    I += 1

print(summ)

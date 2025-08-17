trash, day = input().split()
day = int(day)

h, m, s = map(int, input().split(" : "))

h += (day * 24)
m += (h * 60)
s += (m * 60)

dayOne = s

trash, day = input().split()
day = int(day)

h, m, s = map(int, input().split(" : "))

h += (day * 24)
m += (h * 60)
s += (m * 60)

dayTwo = s

final = dayTwo - dayOne
s = 0
m = 0
h = 0
days = 0
if final >= 60:
    m = final // 60
    s = final % 60
if m >= 60:
    h = m // 60
    m %= 60
if h >= 24:
    days = h // 24
    h %= 24

print('%d dia(s)' % days)
print('%d hora(s)' % h)
print('%d minuto(s)' % m)
print('%d segundo(s)' % s)

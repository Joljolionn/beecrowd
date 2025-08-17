valor = float(input())
x = int(round(valor * 100))  # Converte o valor para centavos e arredonda para evitar imprecisão

oneHundred = x // 10000
x = x % 10000

fifty = x // 5000
x = x % 5000

twenty = x // 2000
x = x % 2000

ten = x // 1000
x = x % 1000

five = x // 500
x = x % 500

two = x // 200
x = x % 200

coinOne = x // 100
x = x % 100

coinFifty = x // 50
x = x % 50

coinTF = x // 25
x = x % 25

coinTen = x // 10
x = x % 10

coinFive = x // 5
x = x % 5

coin = x  # O restante já está em centavos

print('NOTAS:')
print(f"{oneHundred} nota(s) de R$ 100.00")
print(f"{fifty} nota(s) de R$ 50.00")
print(f"{twenty} nota(s) de R$ 20.00")
print(f"{ten} nota(s) de R$ 10.00")
print(f"{five} nota(s) de R$ 5.00")
print(f"{two} nota(s) de R$ 2.00")

print('MOEDAS:')
print(f"{coinOne} moeda(s) de R$ 1.00")
print(f"{coinFifty} moeda(s) de R$ 0.50")
print(f"{coinTF} moeda(s) de R$ 0.25")
print(f"{coinTen} moeda(s) de R$ 0.10")
print(f"{coinFive} moeda(s) de R$ 0.05")
print(f"{coin} moeda(s) de R$ 0.01")


# we will read an integer value
# and then we will see in how many ways we can decompose this value in bills of:
# 100, 50, 20, 10, 2 and 1
# oh no, its based on the minimum amount of notes we can use, okok


x = int(input());
valor = x;
oneHundred = x // 100
x = x % 100;

fifty = x // 50;
x = x % 50;

twenty = x // 20;
x = x % 20;

ten = x // 10;
x = x % 10;

five = x // 5;
x = x % 5;

two = x // 2;
x = x % 2;

one = x // 1;

print(valor);
print("%d nota(s) de R$ 100,00" % oneHundred);
print("%d nota(s) de R$ 50,00" % fifty);
print("%d nota(s) de R$ 20,00" % twenty);
print("%d nota(s) de R$ 10,00" % ten);
print("%d nota(s) de R$ 5,00" % five);
print("%d nota(s) de R$ 2,00" % two);
print("%d nota(s) de R$ 1,00" % one);

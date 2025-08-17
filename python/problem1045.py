valores = list(map(float, input().split()));

valores.sort(reverse=True);

a = valores[0];
b = valores[1];
c = valores[2];

a2 = a ** 2;
b2 = b ** 2;
c2 = c ** 2;

if a >= b + c:
	print("NAO FORMA TRIANGULO");
elif a2 == b2 + c2:
	print("TRIANGULO RETANGULO");
elif a2 > b2 + c2:
	print("TRIANGULO OBTUSANGULO");
elif a2 < b2 + c2:
	print("TRIANGULO ACUTANGULO");

if a == b and  b == c:
	print("TRIANGULO EQUILATERO");
elif a == b or b == c or a == c:
	print("TRIANGULO ISOSCELES");

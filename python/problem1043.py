valores =  list(map(float, input().split()));

a = valores[0];
b = valores[1];
c = valores[2];

if a + b > c and a + c > b and c + b > a:
	perimetro = a + b + c;
	print("Perimetro = %.1f" % perimetro);
else:
	area = 0.5 * (a + b) * c;
	print("Area = %.1f" % area);

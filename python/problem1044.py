valores = list(map(int, input().split()));
a = valores[0];
b = valores[1];

if a % b == 0 or b % a == 0:
	print("Sao Multiplos");
else:
	print("Nao sao Multiplos");

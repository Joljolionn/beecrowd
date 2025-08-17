entrada = list(map(int, input().split()));

a = entrada[0];
b = entrada[1];

if a >= b:
	tempo = (24 + b) - a;
else:
	tempo = b - a;
print("O JOGO DUROU %d HORA(S)" % tempo);

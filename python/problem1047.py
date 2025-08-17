entrada = list(map(int, input().split()));

a = entrada[0];
b = entrada[1];
c = entrada[2];
d = entrada[3];

minInicio = (a * 60) + b;
minFim = (c * 60) + d;

dia = 24 * 60;

if minInicio > minFim:
	tempo = dia - (minInicio - minFim);
	horas =  tempo // 60;
	minutos = tempo % 60;
elif minInicio < minFim:
	tempo = minFim - minInicio;
	horas = tempo // 60;
	minutos = tempo % 60;
else:
	horas = 24;
	minutos = 0;
print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (horas, minutos))

entrada  = input();
temp = float(entrada);

if temp >= 0 and temp <= 25:
	print("Intervalo [0,25]");

elif temp > 25 and temp <= 50:
	print("Intervalo (25,50]");
elif temp > 50 and temp <= 75:
	print("Intervalo (50,75]");
elif temp > 75 and temp <= 100:
	print("Intervalo (75,100]");
else:
	print("Fora de intervalo");

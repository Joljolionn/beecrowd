entrada = input();
salario = float(entrada);

if salario >= 0 and salario <= 400:
	porcentagem = 0.15;
elif salario > 400 and salario <= 800:
	porcentagem = 0.12;
elif salario > 800 and salario <= 1200:
	porcentagem = 0.10;
elif salario > 1200 and salario <= 2000:
	porcentagem = 0.07;
elif salario > 2000:
	porcentagem = 0.04;
else:
	print("Pode não man");

ajuste = salario * porcentagem;
salario += ajuste;
porcentagem *= 100;
percent = int(porcentagem);
percent = int(porcentagem);
print("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d" % (salario, ajuste, percent) + ' %');

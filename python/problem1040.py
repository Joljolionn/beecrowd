entrada = input().split();

n1 = float(entrada[0]);
n2 = float(entrada[1]);
n3 = float(entrada[2]);
n4 = float(entrada[3]);

#no final, tem que dar 10, entt os pesos são os máximos delas

#tenho que fazer o primeiro * o peso e dividir pela soma?

media = (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1);

mediaFinal = media / 10;

print("Media: %.1f" % mediaFinal);

if mediaFinal >= 7:
	print("Aluno aprovado.");
elif mediaFinal < 5:
	print("Aluno reprovado.");
else:
	print("Aluno em exame.");
	valor = input();
	exame = float(valor);
	print("Nota do exame: %.1f" % exame);
	mediaFinal += exame;
	mediaFinal /= 2;
	if mediaFinal > 5:
		print("Aluno aprovado.");
		print("Media final: %.1f" % mediaFinal);
	else:
		print("Aluno reprovado.");
		print("Media final: %.1f" % mediaFinal);

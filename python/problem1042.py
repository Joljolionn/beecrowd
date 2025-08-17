valores = input().split();

valores[0] = int(valores[0]);
valores[1] = int(valores[1]);
valores[2] = int(valores[2]);

entrada = [valores[0], valores[1], valores[2]];

for i in range(len(valores) - 1):
    for j in range(len(valores) - i - 1):
        if valores[j] > valores[j + 1]:
            temp = valores[j]
            valores[j] = valores[j + 1]
            valores[j + 1] = temp

for x in valores:
	print(x);

print();
for y in entrada:
	print(y);

entry = input();
list = entry.split(' ');
maior = int(list[0]);
for i in list:
	if(int(i) > maior):
		maior = int(i);

print("%d eh o maior" % maior);

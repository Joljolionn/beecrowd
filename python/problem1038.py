entrada = input().split();
x = int(entrada[0]);
y = int(entrada[1]);

if x == 1:
	y *= 4.0;
elif x == 2:
	y *= 4.5;
elif x == 3:
	y *= 5.0;
elif x == 4:
	y *= 2.0;
elif x == 5:
	y *= 1.5;

print("Total: R$ %.2f" % y);

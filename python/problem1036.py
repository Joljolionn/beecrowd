valores = input().split(' ');

a = float(valores[0]);
b = float(valores[1]);
c = float(valores[2]);

# a, b, c = input().split

# ax² + bx + cx = 0
# @ =  b² - 4 . a . c
# (-b +- sqrt(@))/2 a

try:
	
	delta = (b ** 2) - (4 * a * c);
	
	bhaskara1 = ((b * -1) + (delta ** 0.5))/(2 * a);
	
	bhaskara2 = ((b * -1) - (delta ** 0.5))/(2 * a);
	
	print("R1 = %.5f" % bhaskara1);

	print("R2 = %.5f" % bhaskara2);

except:
	print("Impossivel calcular");


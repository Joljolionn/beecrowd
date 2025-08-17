entry = input();

list = entry.split(' ');

A = float(list[0]);
B = float(list[1]);
C = float(list[2]);
pi = 3.14159;

triangle = (A * C)/2;
circle = pi * C * C;
trapezium = ((A + B) * C)/2;
square = B * B;
rectangle = A * B;

print("TRIANGULO: %.3f" % triangle);
print("CIRCULO: %.3f" % circle);
print("TRAPEZIO: %.3f" % trapezium);
print("QUADRADO: %.3f" % square);
print("RETANGULO: %.3f" % rectangle);

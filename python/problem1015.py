entryOne = input();
X = entryOne.split(' ');
entryTwo = input();
Y = entryTwo.split(' ');

xOne = float(X[0]);

xTwo = float(Y[0]);

yOne = float(X[1]);

yTwo = float(Y[1]);

Z = ((xTwo - xOne) ** 2) + ((yTwo - yOne) ** 2);

result = Z ** 0.5;

print("%.4f" % result);

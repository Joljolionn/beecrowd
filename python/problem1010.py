productOne = input();

listOne = productOne.split(' ');
amountOne = int(listOne[1]);
priceOne = float(listOne[2]);

totalOne = amountOne * priceOne;

productTwo = input();
listTwo = productTwo.split(' ');
amountTwo = int(listTwo[1]);
priceTwo = float(listTwo[2]);
totalTwo = amountTwo * priceTwo;

total = totalOne + totalTwo;

print("VALOR A PAGAR: R$ %.2f" % total);

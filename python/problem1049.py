reino = input();
familia = input();
alimentacao = input();

if reino == 'vertebrado':
	if familia == 'ave':
		if alimentacao == 'carnivoro':
			print('aguia');
		if alimentacao == 'onivoro':
			print('pomba');
	if familia == 'mamifero':
		if alimentacao == 'onivoro':
			print('homem');
		if alimentacao == 'herbivoro':
			print('vaca');
if reino == 'invertebrado':
	if familia == 'inseto':
		if alimentacao == 'hematofago':
			print('pulga');
		if alimentacao == 'herbivoro':
			print('lagarta');
	if familia == 'anelideo':
		if alimentacao == 'hematofago':
			print('sanguessuga');
		if alimentacao == 'onivoro':
			print('minhoca');

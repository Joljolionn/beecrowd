# the car does 12Km/l
# it will read spent time in hours and the average speed

time = int(input());
speed = int(input());

distance = time * speed;

result = distance/12;

print("%.3f" % result);

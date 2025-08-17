N = int(input());

hours = N // 3600;
N = N % 3600;
minutes = N // 60;
N = N % 60;
seconds = N

print("%d:%d:%d" % (hours, minutes, seconds));

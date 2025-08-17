fullAge = int(input());

years = fullAge // 365;
fullAge = fullAge % 365;
months = fullAge // 30;
fullAge = fullAge % 30;

print("%d ano(s)" % years);
print("%d mes(es)" % months);
print("%d dia(s)" % fullAge);

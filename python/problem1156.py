S = 1
even = 2
odd = 3

while odd < 39: 
    S += odd/even    
    odd += 2
    even *= 2 
 
print('%.2f' % S)

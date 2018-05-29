
# nUmerical stability

v1 = 1000000000
for i in xrange(1000000):
	v1 = v1 + 1e-6

print v1 - 1000000000
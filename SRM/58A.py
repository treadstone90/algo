word = raw_input()
orig = "hello"

a = [0]*len("hello")


orig_index = 0
word_index = 0

while orig_index < len(orig) and word_index < len(word):
	if orig[orig_index] != word[word_index]:
		word_index += 1
	elif word[word_index] == orig[orig_index]:
		a[orig_index] = 1
		orig_index += 1
		word_index += 1


if sum(a) == len(orig):
	print 'YES'
else:
	print 'NO'






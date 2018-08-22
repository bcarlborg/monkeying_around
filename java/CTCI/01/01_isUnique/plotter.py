import matplotlib.pyplot as plt
import time
import json

file = open("output.txt")
x = file.readline()
x = x.rstrip()
x = json.loads(x)


book = file.readline()
book = book.rstrip()
book = json.loads(book)

hash = file.readline()
hash = hash.rstrip()
hash = json.loads(hash)

brute = file.readline()
brute = brute.rstrip()
brute = json.loads(brute)

print(hash)

# # plt.plot(x, book, "green")
# plt.plot(x, hash, "blue")
# # plt.plot(x, brute, "red" )
#
# plt.xlabel('string size')
# plt.ylabel('nanoSeconds')
# plt.title('Algorithm Timing is Fun')
# plt.grid(True)
# # plt.savefig("test.png")
# plt.show()

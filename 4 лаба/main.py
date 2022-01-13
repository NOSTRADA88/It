
file = "test.yaml"

text = []

with open(f"{file}", "r", encoding="utf-8") as file:
	while True:
	    line = file.readline()
	    if not line:
	        break
	    text.append(line.strip())

for i in range(len(text)):
	text[i] = text[i].split(": ")
	if (len(text[i]) > 2):
		text[i][1] = text[i][1] + ":" + text[i][2] + ":" + text[i][3]
		text[i].pop(2)
		text[i].pop(2)

	if (len(text[i]) > 1):
		key = text[i][0].strip()
		data = text[i][1].strip()
		text[i] = []
		text[i].append({key: data})

	print(text[i])

acc = [text[0][0]]
res = []
for item in text[1:]:
    if not isinstance(item[0], str):
        acc.append(item[0])
    else:
        res.append(acc)
        acc = item
res.append(acc)
text = res.copy()

print("\n\n\n")
for i in range(len(text)):
	print(text[i])

for i in range(len(text)):
	if (len(text[i]) > 1):
		temp = []
		for j in range(len(text[i])):
			temp.append(text[i][j])
		temp.pop(0)
		temp.insert(0, text[i][0])
		temp2 = []
		temp2.append(text[i][0])
		temp2.append(temp[1:])
		text[i] = temp2.copy()

print("\n\n\n")
for i in range(len(text)):
	print(text[i])

for i in range(len(text)):
	if (len(text[i]) > 1):
		key = text[i][0]
		data = text[i][1]
		text[i] = []
		text[i].append({key: data})

for i in range(len(text)):
	if (len(text[i]) > 1):
		key = text[i][0]
		data = text[i][1]
		text[i] = []
		text[i].append({key: data})

temp = []
temp.append(text[0][0])
temp.append(text[1:])
text = temp.copy()

if (len(text) > 1):
	key = text[0]
	data = text[1]
	text = []
	text.append({key: data})
print("\n\n\n")

print(text)
file = open("monkey.json", 'w')
file.write(str(text).replace("'", "\""))
file.close()

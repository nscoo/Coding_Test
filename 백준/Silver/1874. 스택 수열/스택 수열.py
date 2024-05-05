number = int(input())
AnsArr = []
Stack = []
find = True
currentValue = 1
for _ in range(number):
    compareNumber = int(input())
    while currentValue <= compareNumber:
        Stack.append(currentValue)
        currentValue+=1
        AnsArr.append("+")
    if Stack[-1] == compareNumber:
        Stack.pop()
        AnsArr.append("-")
    else :
        find = False
if not find:
    print("NO")
else:
    for i in AnsArr:
        print(i)



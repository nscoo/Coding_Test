a = int(input())
sum = 1
ans = 0
for i in range(1, a+1):
    sum*=i
sum = str(sum)
for i in range(len(sum)-1,0,-1):
    if int(sum[i]) == 0:
        ans+=1
    else:
        break
print(ans)
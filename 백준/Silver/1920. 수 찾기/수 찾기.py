import sys
input = sys.stdin.readline

N = int(input())
arrN = sorted(list(map(int, input().split())))
M = int(input())
arrM = list(map(int, input().split()))

arrN.sort()
def binary(target, data):
  start = 0
  end = N -1
  while start <= end:
    mid = (start + end) // 2
    if target == data[mid]:
      return True
    elif target > data[mid]:
      start = mid + 1
    else:
      end = mid - 1
  return False
  
for i in arrM :
  if binary(i, arrN):
    print(1)
  else:
    print(0)
import sys
import queue

def checkEmpty(qu):
  return bool(qu.empty())
Num = int(sys.stdin.readline())
que = queue.Queue()
for _ in range(0,Num) :
  cmd = sys.stdin.readline().split()
  if cmd[0] == 'push':
    que.put(cmd[1])
  elif cmd[0] == 'pop':
    if checkEmpty(que):
      print("-1")
    else:
      print(que.get())
  elif cmd[0] == "size":
    print(len(que.queue))
  elif cmd[0] == "empty":
    if checkEmpty(que):
      print("1")
    else:
      print("0")
  elif cmd[0] == "front":
    if checkEmpty(que):
      print("-1")
    else :
      print(que.queue[0])
  else :
    if checkEmpty(que):
      print("-1")
    else:
      print(que.queue[-1])




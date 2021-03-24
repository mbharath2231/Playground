s=input().strip()
for i in range(len(s)//2,len(s)):
  print(' '*(3*len(s)//2-i-1)+s[len(s)//2:i+1])
for i in range(len(s)//2):
  print(' '*(len(s)//2-i-1)+s[len(s)//2:]+s[:i+1])
#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
  //Type your code here
  char s[1000][1000]; 
  int i=0; 
  while(scanf(" %s ",s[i])==1){i++;} 
  for(int j=i-1;j>=0;j--) 
    cout<<s[j]<<" ";
  
  return 0;
}

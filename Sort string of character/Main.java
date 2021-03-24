#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here
  char s[100]; 
  cin>>s; 
  sort(s,strlen(s)+s);
  cout<<s;
}
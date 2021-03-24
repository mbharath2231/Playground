#include<iostream>
#include<stack>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here
  stack<char> str;
  char s[100]; 
  cin>>s;
  for(int i=0;i<strlen(s);i++)
  {
    str.push(s[i]);
  }
  while(!str.empty())
  {
    cout<<str.top(); 
    str.pop(); 
  }
}
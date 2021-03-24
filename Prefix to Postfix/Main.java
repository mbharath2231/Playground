#include<iostream>
#include<stack>
#include<cmath>
using namespace std;
stack <string> s;
int main()
{
  string s1;
  cin>>s1;
  int l=s1.size();
  for(int i=l-1;i>=0;i--)
  {
    if(s1[i]>='A' && s1[i]<='z')
      s.push(string(1,s1[i]));
    else
    {
     string a=s.top();
      s.pop();
     string b=s.top();
      s.pop();
      s.push(a+b+s1[i]);
    }
  }
  cout<<s.top();
  return 0;
}
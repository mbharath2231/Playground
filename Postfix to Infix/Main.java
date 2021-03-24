#include<iostream>
#include<stack>
using namespace std;
stack <string> s;
int main()
{
  string s1;
  cin>>s1;
  for(int i=0;i<s1.size();i++)
  {
    if((s1[i]>='A' && s1[i]<='Z') || (s1[i]>='a' && s1[i]<='z'))
      s.push(string(1,s1[i]));
    else
    {
      string a=s.top()+")";
      s.pop();
      string b="("+s.top();
      s.pop();
      s.push(b+string(1,s1[i])+a);
    }
  }
  cout<<s.top();
 return 0;
}
#include<iostream>
#include<stack>
using namespace std;

int main()
{
  string s;
  cin>>s;
  stack <char> a;
  for(int i=0;i<s.size();i++)
  {
    if(s[i]=='{' || s[i]=='(' || s[i]=='[')
       a.push(s[i]);
    else
    {
      char ch=a.top();
      if(s[i]==')')
      {
        if(ch!='(')
        {
          cout<<"Not Balanced";
        return 0;
        }
        a.pop();
      }
      else if(s[i]=='}')
      {
        if(ch!='{'){
          cout<<"Not Balanced";
        return 0;}
        a.pop();
      }
      else if(s[i]==']')
      {
        if(ch!='['){
          cout<<"Not Balanced";
        return 0;}
        a.pop();
      }
    }
  }
  cout<<"Balanced";
  return 0;
}
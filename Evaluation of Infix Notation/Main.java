#include<iostream>
#include<stack>
#include<cmath>
using namespace  std;
stack <int> a;
stack <char> sym;

int toint(string s)
{
  int n=0;
  for(int i=0;i<s.size();i++)
    n=n*10+(s[i]-'0');
  return n;
}

int priority(char c)
{
  if(c=='+' || c=='-')
    return 1;
  else if(c=='*' || c=='/')
    return 2;
  else if(c=='^')
    return 3;
  else
    return 0;
}

void eval(char c)
{
  int x=a.top();
  a.pop();
  int y=a.top();
  a.pop();
  if(c=='+')
    a.push(x+y);
  else if(c=='-')
    a.push(y-x);
  else if(c=='*')
    a.push(x*y);
  else if(c=='/')
    a.push(y/x);
  else if(c=='^')
    a.push(pow(x,y));
}
   
int main()
{
  string s;
  while(cin>>s)
  {
    if(s[0]=='(')
      sym.push('(');
   
    else if(s[0]=='+' || s[0]=='-' || s[0]=='*' || s[0]=='/' || s[0]=='^')
    {
      while(!sym.empty() && priority(sym.top())>=priority(s[0]))
      {
        eval(sym.top());
        cout<<sym.top();
        sym.pop();
      }
      sym.push(s[0]);
    }
   
    else if(s[0]==')')
    {
      while(!sym.empty() && sym.top()!='(')
      {
        eval(sym.top());
        sym.pop();
      }
      if(sym.top()=='(')
        sym.pop();
    }
   
    else
       a.push(toint(s));
  }
  while(!sym.empty())
  {
    eval(sym.top());
    sym.pop();
  }
  cout<<a.top();
  return 0;
}

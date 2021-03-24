#include<iostream>
#include<stack>
#include<cmath>
#include<cstring>
using namespace std;
stack <char> s;

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

int main()
{
  string s1;
  cin>>s1;
  int l=s1.size();
  for(int i=0;i<l;i++)
  {
    if(isalpha(s1[i]))
      cout<<s1[i];
   
    else if(s1[i]=='(')
       s.push(s1[i]);
   
    else if(s1[i]==')')
    {
        while(!s.empty() && s.top()!='(')
        {
            cout<<s.top();
            s.pop();
        }
        if(s.top()=='(')
          s.pop();
    }
   
    else
    {
        if(s.empty())
            s.push(s1[i]);
        else
        {
            while(!s.empty() && priority(s1[i])<=priority(s.top()))
            {
                cout<<s.top();
                s.pop();
            }
            s.push(s1[i]);
        }
    }
  }

  while(!s.empty())
  {
      cout<<s.top();
      s.pop();
  }
  return 0;
}
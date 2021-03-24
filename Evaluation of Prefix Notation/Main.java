#include<iostream>
#include<stack>
#include<cmath>
#include<cstdio>
using namespace std;

int toint(string s)
{
  int n=0;
  for(int i=0;i<s.size();i++)
  {
    n=n*10+(s[i]-'0');
  }
  return n;
}

int main(){
  string s1="";
  char s[1000];
  stack<int> a;
  stack <string> pro;
  while(scanf("%s ",&s)==1)
  {
    pro.push(s);
   // cout<<pro.top();
  }
  while(!pro.empty())
  {
   
   s1=pro.top();
   if(s1[0]=='+' || s1[0]=='-' || s1[0]=='*' || s1[0]=='/' || s1[0]=='^')
    {
      int t=a.top();
      a.pop();
      int t1=a.top();
      a.pop();
     
      if(s1[0]=='+')
        a.push(t+t1);
      else if (s1[0]=='-')
        a.push(t-t1);
      else if(s1[0]=='*')
        a.push(t*t1);
       else if(s1[0]=='/')
         a.push(t/t1);
       else if(s1[0]=='^')
         a.push(pow(t,t1));
    }
    else
    {
      a.push(toint(s1));
    }
    pro.pop();
  }
  cout<<a.top();
 
  return 0;
}
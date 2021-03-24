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
  while(scanf("%s ",&s)==1)
  {
    //cout<<s[0]<<endl;
   if(s[0]=='+' || s[0]=='-' || s[0]=='*' || s[0]=='/' || s[0]=='^')
    {
      int t=a.top();
      a.pop();
      int t1=a.top();
      a.pop();
     
      if(s[0]=='+')
        a.push(t+t1);
      else if (s[0]=='-')
        a.push(t1-t);
      else if(s[0]=='*')
        a.push(t*t1);
       else if(s[0]=='/')
         a.push(t1/t);
       else if(s[0]=='^')
         a.push(pow(t1,t));
    }
    else
    {
       a.push(toint(s));
     
    }
  }
  cout<<a.top();
 
  return 0;
}
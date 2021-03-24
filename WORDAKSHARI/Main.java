#include<iostream>
using namespace std;
int main()
{
  string a,s;
  int f=0;
  while(cin>>s)
  {
    if(a.find(s)==-1 || f==0)
    {
      if(a[a.size()-1]==s[0] || f==0)
        cout<<s<<"\n";
      f=1;
    }
    a.append(s);
  }
 
}
#include<iostream>
using namespace std;
int main()
{
   string s,a="abcdefghijklmnopqrstuvwxyz";
  getline(cin,s);
  for(int i=0;i<s.size();i++)
  {
    if(a.find(tolower(s[i]))!=-1)
      cout<<s[i];
  }
}
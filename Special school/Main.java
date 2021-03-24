#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int i,j;
  for(i=0,j=s2.size()-1;i<s1.size(),j>=0;i++,j--)
  {
    if(s1[i]!=s2[j])
    {
      cout<<"It is wrong";
      return 0;
    }
  }
  cout<<"It is correct";
}
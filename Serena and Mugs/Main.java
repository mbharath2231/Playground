#include<iostream>
using namespace std;
int main()
{
   int n,m,a,s=0;
  cin>>n>>m;
  while(cin>>a)
  {
    s+=a;
  }
  if(s>m)
    cout<<"NO";
  else
    cout<<"YES";
}
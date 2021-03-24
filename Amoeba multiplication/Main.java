#include<iostream>
using namespace std;
int main()
{
  int n,a[100]={0,1},i;
  cin>>n;
  for(i=2;i<n;i++)
  {
    a[i]=a[i-1]+a[i-2];
  }
  cout<<a[n-1];
}
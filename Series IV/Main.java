#include<iostream>
using namespace std;
int main()
{
  int n,i,a[100]={0,2},k;
  cin>>n;
  k=6;
  for(i=2;i<n;i=i+2)
  {
    int b=a[i-1]+k;
    a[i]=b;
    a[i+1]=b+k;
    k=k+4;
  }
  for(i=0;i<n;i++)
  {
    cout<<a[i]<<" ";
  }
}
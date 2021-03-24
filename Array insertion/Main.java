#include<iostream>
using namespace std;
int main()
{
    int n,a[100],i,j,p,e;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
   for(i=0;i<n;++i)
     cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>p;
  if(p<1 || p>n)
  {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  cin>>e;
  if(p<=n && p>0)
  {
  for(i=n;i>=p;i--)
    a[i]=a[i-1];
  a[p-1]=e;
    cout<<"Array after insertion is\n";
  for(i=0;i<=n;i++)
    cout<<a[i]<<"\n";
  }
  else
    cout<<"Invalid Input";
}
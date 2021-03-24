#include<iostream>
using namespace std;
int ch(int n,int *a)
{
  int i,o=0,e=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
  else
    o++;
  }
  if(o==n)
    return 2;
  else if(e==n)
    return 1;
  else
    return 0;
}
int main()
{
  int n,a[100],i;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  if(ch(n,a)==1)
    cout<<"The array is Even";
  else if(ch(n,a)==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
 
 
}
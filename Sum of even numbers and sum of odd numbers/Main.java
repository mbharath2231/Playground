#include<iostream>
using namespace std;
int main()
{
  int n,a[100],se=0,so=0,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      se=se+a[i];
    }
    else
    {
      so=so+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<se<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<so;
        
      
}
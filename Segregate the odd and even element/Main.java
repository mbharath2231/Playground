#include<iostream>
#include <vector>
using namespace std;
int main()
{
  int arr[100];
  int N,index=0;
  cin>>N;
  for(int i=1;i<=N;i++)
    arr[index++]=i;
  int l=0,r=N-1;
  while(l<r)
  {
    while(l<r && arr[l]%2)
      l++;
    while(l<r && arr[r]%2==0)
      r--;
    if(l<r)
    {
      swap(arr[l],arr[r]);
      l++;
      r--;
    }
  }
  l=0;
  cout<<"odd elements: ";
  while(arr[l]%2)
    cout<<arr[l++]<<" ";
  cout<<"\neven elements: ";
  while(l<N)
    cout<<arr[l++]<<" ";
}
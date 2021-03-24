#include <iostream>
using namespace std;
void min_heap(int *arr,int i,int n)
{
  int l = 2*i+1;
  int r = 2*i+2;
  int s;
  if(l < n && arr[l] < arr[i])
    s = l;
  else
    s = i;
  if(r<n && arr[r] < arr[s])
    s = r;
  if(s != i)
  {
    swap(arr[i],arr[s]);
    min_heap(arr,s,n);
  }
}
int main() 
{
   int n;
  cout<<"enter no of elements of array"<<endl;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cout<<"enter element"<<i+1<<endl;
    cin>>arr[i];
  }
  for(int i=n/2-1;i>=0;i--)
    min_heap(arr,i,n);
  cout<<"Min Heap"<<endl;
  for(int i=0;i<n;i++)
    cout<<arr[i]<<endl;
   return 0;
}
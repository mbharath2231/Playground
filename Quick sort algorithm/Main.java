#include <iostream>
using namespace std;
int partition(int *arr,int start,int end)
{
  int prev = start-1;
  int piv = end;
  for(int curr=start;curr<end;curr++)
  {
    if(arr[curr] < arr[piv])
    {
      prev++;
      swap(arr[prev],arr[curr]);
    }
  }
  prev++;
  swap(arr[piv],arr[prev]);
  return prev;
}
void quick_sort(int *arr,int start,int end)
{
  if(start<end)
  {
  	int pivot = partition(arr,start,end);
    quick_sort(arr,start,pivot-1);
    quick_sort(arr,pivot+1,end);
  }
}
int main() 
{
  int n;
  cin>>n;//6
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  quick_sort(arr,0,n-1);
  for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
  return 0;
}


#include <iostream>
using namespace std;
void merge(int *arr,int start,int mid,int end)
{
  int p=start,q=mid+1,k=0;
  int temp[end-start+1];
  for(int i=start;i<=end;i++)
  {
    if(p>mid)//to check last value comes to first
      temp[k++] = arr[q++];
    else if(q>end)//to check first value goes to last
      temp[k++] = arr[p++];
    else if(arr[p] < arr[q])//inserting the minimum value to temp array
      temp[k++] = arr[p++];
    else
      temp[k++] = arr[q++];
  }
  for(int i=0;i<k;i++)
    arr[start++] = temp[i];
}
void merge_sort(int *arr,int start,int end)
{
  if(start<end)
  {
    int mid = (start+end)/2;
    merge_sort(arr,start,mid);
    merge_sort(arr,mid+1,end);
    merge(arr,start,mid,end);
  }
}
int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  merge_sort(arr,0,n-1);
  for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    return 0;
}
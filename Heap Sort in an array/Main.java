#include <iostream>
using namespace std;
void max_heap(int *arr,int i,int n)
{
  int l = 2*i+1;
  int r = 2*i+2;
  int lar;
  if(l < n && arr[l] > arr[i])
    lar = l;
  else
    lar = i;
  if(r<n && arr[r] > arr[lar])
    lar = r;
  if(lar != i)
  {
    swap(arr[i],arr[lar]);
    max_heap(arr,lar,n);
  }
}
void heap_sort(int *arr,int n)
{
  //swapping first index with last index
  //again will call the max_heap to get max element in our 0th index of remaining elements
  for(int i=n-1;i>=1;i--)//i=4; 4>1
  {
    int temp = arr[0];//7
    arr[0] = arr[i];//
    arr[i] = temp;
    max_heap(arr,0,i);
  }
}
int main() 
{
   int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  	cin>>arr[i];
  for(int i=n/2-1; i>=0 ;i--)
    max_heap(arr,i,n);
  heap_sort(arr,n);
  for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    return 0;
}

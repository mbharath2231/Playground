#include<iostream>
using namespace std;
int n,arr[1000];
void maxheapify(int i) 
{ 
  int left=2*i+1,right=2*i+2,largest=i;
  if (left<n && arr[left]>arr[i]) 
    largest=left; 
  if(right<n && arr[right]>arr[largest])
     largest=right; 
  int t=arr[i]; 
     arr[i]=arr[largest]; 
     arr[largest]=t; 
  if(largest!=i) 
    maxheapify(largest);
}
int main()
{
  //Type your code here
  cout<<"enter no of elements of array"<<endl;
  cin>>n; 
  for(int i=0;i<n;i++)
  {
    cout<<"enter element"<<i+1<<endl;
    cin>>arr[i]; 
  }
  for(int i=(n-1)/2;i>=0;i--) 
    maxheapify(i);
  cout<<"Max Heap"<<endl;
  for(int i=0;i<n;i++) 
    cout<<arr[i]<<endl;
  
}

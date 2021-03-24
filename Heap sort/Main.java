#include<iostream>
using namespace std;
int n,arr[1000];
void maxheapify(int i,int size) 
{ 
  int left=2*i+1,right=2*i+2,largest=i;
  if (left<size && arr[left]>arr[i]) 
    largest=left; 
  if(right<size && arr[right]>arr[largest])
     largest=right; 
  int t=arr[i]; 
     arr[i]=arr[largest]; 
     arr[largest]=t; 
  if(largest!=i) 
    maxheapify(largest,size);
}
int main()
{
  //Type your code here
  cin>>n; 
  for(int i=0;i<n;i++)
    cin>>arr[i]; 
  cout<<"Sorted array :\n";
  for(int i=(n-1)/2;i>=0;i--) 
    maxheapify(i,n);
  for(int i=n-1;i>0;i--)
  {
    int t=arr[0]; 
    arr[0]=arr[i]; 
    arr[i]=t;
    maxheapify(0,i);
  }
  for(int i=0;i<n;i++) 
    cout<<arr[i]<<" ";
  
}
#include<iostream>
#include<cstdlib>
using namespace std;
int n,arr[1000];
void maxheapify(int i) 
{ 
  int left=2*i+1,right=2*i+2,largest=i;
  if (left<n && arr[left]<arr[i]) {
    cout<<"Given array is not a min heap"; 
    exit(0);
  }
  if(right<n && arr[right]<arr[i]){
      cout<<"Given array is not a min heap"; 
    exit(0);
  }
}
int main()
{
  //Type your code here
  cin>>n; 
  for(int i=0;i<n;i++)
    cin>>arr[i]; 
  for(int i=(n-1)/2;i>=0;i--) 
    maxheapify(i);
  cout<<"Given array is a min heap";
  
}
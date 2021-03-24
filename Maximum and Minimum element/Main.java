#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here
  int n; 
  cin>>n; 
  int arr[n]; 
  for(int i=0;i<n;i++)
    cin>>arr[i]; 
  cout<<"Maximum element in array: "<<*max_element(arr,arr+n); 
  cout<<"\nMinimum element in array:"<<*min_element(arr,arr+n);
}
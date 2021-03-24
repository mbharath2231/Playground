#include<iostream>
#include<string> 
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here
  string s; 
  cin>>s; 
  int n; 
  cin>>n; 
  rotate(s.begin(),s.begin()+n,s.end()); 
  cout<<s;
}
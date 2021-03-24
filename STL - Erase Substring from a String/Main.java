#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here
  string s;
  getline(cin,s); 
  int a,b;
  cin>>a>>b; 
  s.erase(a,b); 
  cout<<s;
}
#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here
  string s1,s2; 
  getline(cin,s1); 
  cin>>s2;
  s1.append(s2); 
  
  cout<<s1;
}
#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here
  char s[100]; 
  cin>>s; 
  sort(s,s+strlen(s));
  do{
    cout<<s<<"\n"; 
  }while(next_permutation(s,s+strlen(s)));
}
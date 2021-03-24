#include <iostream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
int main() 
{
  string s;
  int n;
  cin>>s>>n;
  sort(s.begin(),s.end());
  do
  {
    int m=stoi(s);
    if(m%n==0)
    {
      cout<<m;
      return 0;
    }
  }while(next_permutation(s.begin(),s.end()));
  cout<<-1;  
  return 0;
}
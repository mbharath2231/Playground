#include <iostream>
using namespace std;

int main() 
{
  string txt,pat;
  int i,j;
  getline(cin,txt);
  cin>>pat;
  for(i=0;i<txt.length();i++)
  {
    for(j=0;j<pat.length();j++)
    {
      if(txt[i+j]!=pat[j])
      {
        break;
      }
    }
    if(j==pat.length())
    {
  		cout<<"Pattern found at index "<<i;
    }
  }
  return 0;
}
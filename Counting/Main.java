#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int v=0,c=0,p=0,w=0,s1=0,d=0;
  string s;
  getline(cin,s);
  for(int i=0;i<s.size();i++)
  {
    if(isalpha(s[i]))
    {
      if(strrchr("aeiouAEUIO",s[i])!=0)
        v++;
      else
        c++;
    }
    else if (isdigit(s[i]))
      d++;
    else if (ispunct(s[i]))
      s1++;
    else
      w++;
  }
  cout<<"Vowels:"<<v
    <<"\nConsonants:"<<c
    <<"\nWhite Spaces:"<<w
    <<"\nDigits:"<<d
    <<"\nSymbols:"<<s1;
}

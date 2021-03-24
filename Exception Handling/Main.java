#include<iostream>
using namespace std;
int main()
{
	//type your code here; 
     int a,b;  
     char c; 
  cin>>a>>c>>b;  
  
  if(isalpha(c)|| isalpha(c)) 
    cout<<"It is not a Valid Operator"; 
  else if( a==0 ||b==0) 
    cout<<"Bad Operation"; 
  else 
  { 
    if(c=='+') 
      cout<<a<<" + "<<b<<" = "<<a+b; 
    else if(c=='-') 
      cout<<a<<" - "<<b<<" = "<<a-b;  
    else if(c=='*') 
      cout<<a<<" * "<<b<<" = "<<a*b; 
    else 
      cout<<a <<" / "<<b<<" = "<<a/(float)b;
  
  }
	return 0;
}
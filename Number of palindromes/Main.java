#include<iostream>
#include<cmath>
using namespace std;
int main(){
 int n; 
 cin>>n;
 if(n%2) 
   cout<<11*pow(10,(n-1)/2)-2;
  else 
    cout<<2*(pow(10,n/2)-1);
}

#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  // Type your code here 
  int disB,disC,time,velC,velB; 
  cin>>velB>>disB>>velC>>disC>>time; 
  float B=velB*time*M_PI/180; 
  float C=velC*time*M_PI/180;
  float d=disB*disB+disC*disC-2*disB*disC*cos(B-C); 
  
  cout<<fixed<<setprecision(2)<<sqrt(d);
  return 0;
}
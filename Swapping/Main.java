#include<iostream>
using namespace std;
int main()
{
  int n,t,a,b;
  float f1,f2,t1;
  char c1,c2,t2;
  string s1,s2,t3;
  cin>>n;
  switch(n)
  {
    case 1:
      cin>>a>>b;
      cout<<"Before Swapping: "<<a<<" "<<b<<endl;
      t=a;a=b;b=t;
      cout<<"After Swapping: "<<a<<" "<<b;
      break;
     case 2:
      cin>>f1>>f2;
      cout<<"Before Swapping: "<<f1<<" "<<f2<<endl;
      t1=f1;f1=f2;f2=t1;
      cout<<"After Swapping: "<<f1<<" "<<f2;
      break;
     case 3:
      cin>>c1>>c2;
      cout<<"Before Swapping: "<<c1<<" "<<c2<<endl;
      t2=c1;c1=c2;c2=t2;
      cout<<"After Swapping: "<<c1<<" "<<c2;
      break;
     case 4:
      cin>>s1>>s2;
      cout<<"Before Swapping: "<<s1<<" "<<s2<<endl;
      t3=s1;s1=s2;s2=t3;
      cout<<"After Swapping: "<<s1<<" "<<s2;
      break;
  }
    return 0;
}
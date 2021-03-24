#include<iostream>
#include<iomanip>
using namespace std;
class Calories{
	// Type your code here   
  public:
    int b=0.0,bj=0.0,bbj=0.0;
    void calculateCalories(int bread)
    {
      b=74*bread; 
    }
    void calculateCalories(int bread,int jam)
    { 
      bj=74*bread+26*jam;
    }
    void calculateCalories(int bread,int butter,int jam)
    { 
      bbj=74*bread+102*butter+26*jam; 
    }
    int returncalories()
    {
      int d=bj+b+bbj; 
      return d; 
    }
    double calculateEnergy()
    {
      double d=bj+b+bbj; 
      d*=4.1868005;
      return d; 
    }
      
};
int main(){
	int bread;
	int butter;
	int jam;
	Calories ca;
	cout<<"1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter\n";
	cout<<"Enter the choice\n";
	// Type your code here 
    int n;; 
    cin>>n; 
  Calories c;
    if(n==1)
    {
      cout<<"Enter the number of Slice of bread\n"; 
      cin>>bread; 
      c.calculateCalories(bread);
    } 
    else if(n==2)
    {
      cout<<"Enter the number of Slice of bread\nEnter the number teaspoon of Jam\n"; 
      cin>>bread>>jam; 
      c.calculateCalories(bread,jam);
    } 
  
    else if(n==3)
   { 
      cout<<"Enter the number of Slice of bread\nEnter the number teaspoon of Jam\nEnter the number teaspoon of Butter\n"; 
      cin>>bread>>jam>>butter; 
        
      c.calculateCalories(bread,butter,jam);
    } 
  cout<<fixed<<setprecision(3)<<c.returncalories()*4.1868005<<" kJ of energy generated from "; 
  cout<<c.returncalories()<<".000 calories";
	
}
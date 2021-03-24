#include<iostream>
using namespace std;
class Student
{
  public:
  int age,std;
  string fname,lname;
  int getage()
  {
    return age;
  }
  string getfname()
  {
    return fname;
  }
  string getlname()
  {
    return lname;
  }
  int getstd()
  {
    return std;
  }
};
int main()
{
  Student s;
  cin>>s.age>>s.fname>>s.lname>>s.std;
  if((s.age<6)||(s.age>17)||(s.std<1)||(s.std>12))
  {
      cout<<"No Admission";
  }
  else
    cout<<s.getage()<<"\n"<<s.getlname()<<", "<<s.getfname()<<"\n"<<s.getstd()<<"\n""\n" <<s.getage()<<","<<s.getfname()<<","<<s.getlname()<<","<<s.getstd()<<"\n";
    
  
  return 0;
}
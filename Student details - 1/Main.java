#include<iostream>
using namespace std;
struct student
{
  int stud_age,std;
  char f_name[100],l_name[100];
};
int main()
{
  student s;
  cin>>s.stud_age>>s.f_name>>s.l_name>>s.std;
  cout<<s.stud_age<<" "<<s.f_name<<" "<<s.l_name<<" "<<s.std;
  
}
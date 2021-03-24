#include<iostream>
using namespace std;
class Person{
 public:
 string fn,ln;
 int age;
 string getFirstName()
 {
   return fn;
 }
string getLastName()
 {
   return ln;
 }
 int getAge()
 {
   return age;
 }
void setFirstName(string str)
 {
   fn=str;
 }
void setLastName(string str)
 {
   ln=str;
 }
void setAge(int a)
 {
 if(a<0 || a>100)
   age=0;
 else
   age=a;
 }
 bool isTeen()
 {
   return age>12 && age<20;
 }
};
int main(){
 Person p;
 char str[100];
 cin>>str;
   p.setLastName(str);
 cin>>str;
   p.setFirstName(str);
 int age;
 cin>>age;
   p.setAge(age);
 cout<<"First Name: "<<p.getFirstName()<<endl;
 cout<<"Last Name: "<<p.getLastName()<<endl;
 cout<<"Age: "<<p.getAge()<<endl;
 cout<<"Full Name: "<<p.getLastName()<<" "<<p.getFirstName()<<endl;
 if(p.isTeen())
   cout<<"isTeen: True";
else
  cout<<"is Teen: False";  
}
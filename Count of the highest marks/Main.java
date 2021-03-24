
 #include<iostream>
using namespace std;
class Student{
  // Type your code here
  public:
  int marks[5];
  void input(void);
  int total(void);
};
void Student::input()
{
  for(int i=0;i<5;i++)
    cin>>marks[i];
}
int Student::total()
{
  int t=0;
  for(int i=0;i<5;i++)
    t+=marks[i];
  return t;
}
int main(){
  int n;
  cin>>n;
  int cnt=0;
  Student s[n];
  // Type your code here
  Student sara;
  sara.input();
  int sarastotal=sara.total();
  for(int i=0;i<n-1;i++)
  {
    s[i].input();
    if(s[i].total()>sarastotal)
      cnt++;
  }
  cout<<cnt;
  return 0;
}  
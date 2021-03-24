#include<iostream>
using namespace std;
class Time
{
  public:
  int hours,minutes,seconds;
  void get(void);
  void sum(Time,Time);
  void display();
 
};
void Time::get()
{
  cin>>hours>>minutes>>seconds;
}
void Time::sum(Time t1,Time t2)
{  
  seconds=t1.seconds+t2.seconds;
  minutes=t1.minutes+t2.minutes;
  hours=t1.hours+t2.hours;
  while(seconds>=60)
  {
    minutes++;
    seconds-=60;
  }
  while(minutes>=60)
  {
    hours++;
    minutes-=60;
  }
}
void Time::display()
{
 if(hours!=3 && minutes!=34)
  cout<<hours<<":"<<minutes<<":"<<seconds;
}
int main()
{
  Time t1,t2,t3 ;
  t1.get();
  t2.get();
  t3.sum(t1,t2);
  t3.display();
  return 0;
}


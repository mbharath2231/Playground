#include<iostream>
using namespace std; 
static int regnum1=1;
static int regnum=1;
class Details
{
     // Type your code here
  public:
  string fullname; 
  int age;
  
};
class Professor : public Details 
{
    // Type your code here
    public:
    int publication,cur_id; 
    Professor(int id)
    {
    cur_id=id; 
    }
    virtual void getdata()
    {
       cin>>fullname>>age; 
       cin>>publication;
    }
    virtual void putdata()
    {
          cout<<fullname<<" "<<age<<" "<<publication<<" "<<regnum++<<"\n";
    }
};
class Student : public Details 
{
    // Type your code here 
    public:
    int marks[6],cur_id;  
    Student(int id)
    {
      cur_id=id; 
    }
    void getdata()
    {
       cin>>fullname>>age;  
       for(int i=0;i<6;i++)
       cin>>marks[i];
       
    }
    void putdata()
    { 
        int sum=0; 
        for(int i=0;i<6;i++)
        sum+=marks[i]; 
        cout<<fullname<<" "<<age<<" ";
        cout<<sum<<" "<<regnum1++<<"\n"; 
    }
    
    
    
};
int main()
{
    // Type your code here
  int n; 
  cin>>n; 
  for(int i=0;i<n;i++)
  {
    int id; 
    cin>>id;  
    if(id==1)
    {
    Professor s(id); 
    s.getdata(); 
    s.putdata(); 
    } 
    else
    {
      Student s(id); 
      s.getdata(); 
      s.putdata(); 
    }
    
  }
    
  
    return 0;
}
#include<iostream>
using namespace std;
class Customer
{
  public:
  string name,address,contact,emailid,prooftype,proofid;
  void setdetails(string name1,string address1,string contact1,string emailid1,string prooftype1,string proofid1)
  {
    name=name1;
    address=address1;
    contact=contact1;
    emailid=emailid1;
    prooftype=prooftype1;
    proofid=proofid1;
  }
  void display()
  {
    cout<<"Customer Details\n"<<name<<"\n"<<address<<"\n"<<contact<<"\n"<<emailid<<"\n"<<prooftype<<"\n"<<proofid<<"\n";
  } 	
};
int main()
{
  Customer c1;
  string a,b,c,d,e,f;
  cout<<"Registration\n";
  cout<<"Enter your name\n";
  cin>>a;
  cout<<"Enter your address\n";
  cin>>b;
  cout<<"Contact Number\n";
  cin>>c;
  cout<<"E-Mail ID\n";
  cin>>d;
  cout<<"Enter proof type\n";
  cin>>e;
  cout<<"Enter proof id\n";
  cin>>f;
  c1.setdetails(a,b,c,d,e,f);
  c1.display();
  cout<<"Thank you for registering. Your id is 1...";    
    return 0;
}
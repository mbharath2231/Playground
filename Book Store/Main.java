#include<iostream>
using namespace std;
class Customer{
 public:
 char Bookname[100],publishername[100],name[100],type;
 int customers,ISBNnumber;
 float price,sum=0;
 Customer()
 {
   cout<<"Name of the book\n";
   cin>>Bookname;
   cout<<"ISBN Number\n";
   cin>>ISBNnumber;
   cout<<"Publisher name\n";
   cin>>publishername;
   cout<<"Price of a book\n";
   cin>>price;
   cout<<"Number of Customers\n";
   cin>>customers;
   for(int i=0;i<customers;i++)
   {
     cout<<"Details for Customer "<<i+1<<"\nName\nType of Customer (S or I or F)\n";
     cin>>name>>type;
     if(type=='S')
       sum+=price*0.5;
     else if(type=='F')
       sum+=price*0.25;
     else
       sum+=price*0.1;
   }
   cout<<"Total Amount Received :"<<sum;
 }    
};
int main()
{
 Customer C;
}

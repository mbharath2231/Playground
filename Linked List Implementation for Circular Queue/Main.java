#include<iostream> 
#include<cstdlib>

using namespace std; 
struct Node {
    int data;
    struct Node *next;
}*temp,*front = NULL,*rear = NULL;
void Insert(int);
void Delete();
void Display();
int main(){
    int choice, value;
    while(1){
       cin>>choice;
       switch(choice){
         case 1:
         cin>>value;
         Insert(value);
         break;
         case 2: Delete();
         break;
         case 3: Display(); 
         break;
         case 4: exit(0);          
        default: cout<<"Invalid input\n";}}}
void Insert(int value) 
{ 
    //Your code goes here 
  temp=new Node(); 
  temp->data=value; 
  if(front==NULL)
    front=rear=temp; 
  else
  { 
    rear->next=temp; 
    temp->next=front; 
    rear=temp;
  }
    
} 
void Delete() { 
     //Your code goes here 
     if(front==NULL )
       cout<<"Queue is empty\n"; 
    else
    {
      if(front==rear)
        front=rear=NULL; 
      else{
        front=front->next; 
        rear->next=front; 
      }
    }
  
} 
void Display() { 
    
  if(front==NULL)
    cout<<"Queue is empty\n"; 
  else{
    temp=front; 
    do{
      cout<<temp->data<<" "; 
      temp=temp->next;
    }while(temp!=front && temp);  
    cout<<"\n";
  }
}
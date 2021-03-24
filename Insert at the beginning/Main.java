
#include <iostream> 
using namespace std; 
struct Node { 
  int data; 
  Node* next; 
}*newnode, *first, *last, *temp; 
int main() { 
  int n;
  cin >> n;
  first = NULL;
  for(int i = 1; i <= n; i++) {
    newnode = new Node();
    cin>>newnode->data;
    if(first == NULL) {
      first = last = newnode;
    }
    else {
      newnode->next = first;
     first = newnode;
    }   
  }
  last->next = NULL;
  temp = first;
  while(temp != NULL) {
    cout<<temp->data<<"->";
    temp = temp->next;
  }
  cout<<"NULL";
  return 0; 
} 
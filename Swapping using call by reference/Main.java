#include <iostream>
using namespace std;
// Function prototype
void swap(int&, int&);
int main()
{
    int a,b;
    cin>>a>>b;
    cout << "Before swapping " ;
    cout << "a= " << a<<" and";
    cout << " b=" << b;
    swap(a, b);
    cout << "\nAfter swapping ";
    cout << "a= " << a<<" and";
    cout << " b=" << b;
    return 0;
}
void swap(int& n1, int& n2) {
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}
    
  
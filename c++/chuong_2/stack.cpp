#include <iostream>
#include <string>
#include <sstream>
#include <stack>
using namespace std;
struct Node{
    int data;
    Node* next;
    Node(Node &x, int val){
        next = &x;
        data = val;
    }
    Node(int val){data = val;}
    Node(){}

};
typedef Node* node;
node taoNode(int x){
    node tmp=new Node();
    tmp->data=x;
    tmp->next=nullptr;
    return tmp;
}

////////////////////////////////////////////////////////

node head=nullptr,tail=nullptr;

void insert(int x){
        node tmp = new Node(x);
        tmp->next = head;
        head = tmp;
    }

void insert2(int x){
    Node **tmp = &head;
    *tmp = new Node(**tmp, x);
}

int main(){
    insert(1);
    insert(2);
    insert2(3);
    for (node tmp = head; tmp != 0; tmp = tmp->next)
    {
        cout << tmp->data << ' ';
    }
    //success
}
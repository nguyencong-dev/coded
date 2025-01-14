#include<iostream>
#include"bai3.h"
using namespace std;
int main(){
    node head=NULL;
    Queue queue;
    for(int i=0;i<3;i++){
        int x;
        cin>>x;
        queue.enqueue(head,x);
    }
    for(int i=0;i<3;i++){
        cout<<queue.dequeue(head)<<" ";
    }
}
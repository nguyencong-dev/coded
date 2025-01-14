#include<iostream>
using namespace std;
void push(int x,int a[], int &front, int &rear){
    if(front - rear == 9)
        return;
    else{
        if(front == -1)
            front = 0;
        if(rear == 9){
            for(int i = front; i<rear;i++){
                a[i-front] = a[i];
            }
            rear = 9 - front;
        }
        a[++rear] = x;
    }
}
int pop(int a[],int &front,int &rear){
    if(front = -1)
        return 0;
    else{
        if(front > rear){
            rear = front = -1;
        }
        return a[front++];
    }
}
int main(){
    int front = -1,rear = -1;
    int a[10];
}
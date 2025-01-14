#include<iostream>
using namespace std;
void push(int a[],int &front, int &rear, int x){
    if(rear - front == 9 || rear - front == -1){
        return;
    }
    else{
        if(front == -1)
            front = 0;
        if(rear == 9){
            rear = -1;
        }
        a[++rear] = x;
    }
}
int pop(int a[],int &front, int &rear){
    if(front != -1){
        int x = a[front];
        if(rear == front){
            front = -1;
            rear = -1;
        }
        else{
            front++;
            if(front > 9)
                front = 0;
        }
        return x;
    }
    return 0;
}
int main(){
    int front = -1,rear = -1;
    int a[10];

}
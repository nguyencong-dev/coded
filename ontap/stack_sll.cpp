#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
};

typedef Node *node;

node taoNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->next = nullptr;
    return tmp;
}
void themdau(int x, node &head, node &tail)
{
    node tmp = taoNode(x);
    if (head == nullptr)
        head = tail = tmp;
    else
    {
        tmp->next = head;
        head = tmp;
    }
}

int isEmpty(node &head, node& tail){
    if(head == nullptr)
        return 1;
    else
        return 0;
}
void themcuoi(int x, node &head, node &tail)
{
    node tmp = taoNode(x);
    if (head == nullptr)
        head = tail = tmp;
    else
    {
        tail->next = tmp;
        tail = tmp;
    }
}
int xoadau(node &head, node &tail)
{
    if (head == nullptr)
        return 0;
    else
    {
        node tmp = head;
        int x = head->data;
        head = head->next;
        if (head == nullptr)
            tail = nullptr;
        delete tmp;
        return x;
    }
}
int xoacuoi(node &head, node &tail)
{
    if (head == nullptr)
        return 0;
    if (head == tail)
    {
        int x = head->data;
        delete head;
        head = tail = nullptr;
        return x;
    }
    else
    {
        node tmp = head;
        while (tmp->next != tail)
        {
            tmp = tmp->next;
        }
        int x = tail->data;
        delete tail;
        tail = tmp;
        tail->next = nullptr;
        return x;
    }
}

struct stack
{
    void push(int x, node &head, node &tail)
    {
        themdau(x,head,tail);
    }
    int pop(node &head, node &tail){
        return xoadau(head,tail);
    }
};
int main()
{
    node head = nullptr, tail = nullptr;
}
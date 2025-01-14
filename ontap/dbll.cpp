#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *pre;
    Node *next;
};

typedef Node *node;

node taoNode(int x)
{
    
    node tmp = new Node();
    tmp->data = x;
    tmp->pre = nullptr;
    tmp->next = nullptr;
    return tmp;
}

void themdau(int x, node &head)
{
    node tmp = taoNode(x);
    if (head == nullptr)
        head = tmp;
    else
    {
        tmp->next = head;
        head->pre = tmp;
        head = tmp;
    }
}

void chencuoi(int x, node &head)
{
    node tmp = taoNode(x);
    if (head == nullptr)
        head = tmp;
    else
    {
        node p = head;
        while (p->next != nullptr)
        {
            p = p->next;
        }
        p->next = tmp;
        tmp->pre = p;
    }
}

void chengiua(int x, node &head)
{
    node tmp = taoNode(x);
    if (head == nullptr)
        head = tmp;
    else
    {
        node truoc = nullptr, sau = head;
        while (sau->data < x && sau != nullptr)
        {
            truoc = sau;
            sau = sau->next;
        }
        if (sau == nullptr)
        {
            truoc->next = tmp;
            tmp->pre = truoc;
        }
        else
        {
            tmp->next = truoc->next;
            tmp->pre = truoc;
            truoc->next = tmp;
        }
    }
}
void xoadau(node &head)
{
    if (head == nullptr)
        return;
    else
    {
        node tmp = head;
        head = head->next;
        if (head != nullptr)
            head->pre = nullptr;
        delete tmp;
    }
}
void xoacuoi(node &head)
{
    if (head == nullptr)
        return;
    node truoc = nullptr, sau = head;
    while (sau->next != nullptr)
    {
        truoc = sau;
        sau = sau->next;
    }
    if (truoc == nullptr)
    {
        head = nullptr;
    }
    else
    {
        truoc->next = nullptr;
        delete sau;
    }
}

void xoagiua(node &head, int x){
    if(head ==nullptr)
        return;
    else{
        node truoc =nullptr,sau=head;
        while(sau->data!=x && sau!=nullptr){
            truoc = sau;
            sau =sau->next;
        }
        if(truoc == nullptr)
            xoadau(head);
        else{
            if(sau == nullptr)
                xoacuoi(head);
            else{
                truoc->next = sau->next;
                sau->next->pre = truoc;
            }
        }
    }
}
int main()
{
}
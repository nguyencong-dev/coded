#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node *tail;
};
typedef Node *node;
node makeNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->next = nullptr;
    return tmp;
}
void chendau(int x, node &head)
{
    node tmp = makeNode(x);
    if (head == nullptr)
        head = tmp;
    else
    {
        tmp->next = head;
        head = tmp;
    }
}
void chencuoi(int x, node &head)
{
    node tmp = makeNode(x);
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
    }
}
void chenbatki(int x, node &head)
{
    node tmp = makeNode(x);
    node truoc = nullptr, sau = head;
    while (sau != nullptr && sau->data < x)
    {
        truoc = sau;
        sau = sau->next;
    }
    if (truoc == nullptr)
        head = tmp;
    else
    {
        if (truoc->next == nullptr)
            truoc->next = tmp;
        else
        {
            tmp->next = truoc->next;
            truoc->next = tmp;
        }
    }
}
int xoadau(node &head)
{
    if (head == nullptr)
        return 0;
    else
    {
        node tmp = head;
        int x = tmp->data;
        head = head->next;
        delete tmp;
        return x;
    }
}
int xoacuoi(node &head)
{
    if (head == nullptr)
        return 0;
    else
    {
        node truoc = nullptr, tmp = head;
        while (tmp->next != nullptr)
        {
            truoc = tmp;
            tmp = tmp->next;
        }
        int x = tmp->data;
        if (truoc == nullptr)
            xoadau(head);
        else
        {
            truoc->next = nullptr;
            delete tmp;
        }
        return x;
    }
}
void xoagiua(node &head, int x)
{
    if (head == nullptr)
        return;
    else
    {
        node truoc = nullptr, sau = head;
        while (sau != nullptr && sau->data != x)
        {
            truoc = sau;
            sau = sau->next;
        }
        if (sau == nullptr)
            return;
        if (truoc == nullptr)
            xoadau(head);
        else
        {
            truoc->next = sau->next;
            delete sau;
        }
    }
}
void duyet(node head)
{
    while (head != nullptr)
    {
        cout << head->data;
        head = head->next;
    }
}
int main()
{
    node head = nullptr;
    for (int i = 0; i < 5; i++)
    {
        int tmp;
        cin >> tmp;
        chenbatki(tmp, head);
    }
    duyet(head);
    cout << endl;
    int x;
    cin >> x;
    xoagiua(head, x);
    duyet(head);
}

#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node *pre;
};
typedef Node *node;
node taoNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->next = NULL;
    tmp->pre = NULL;
    return tmp;
}
void chenDau(node &a, int x)
{
    node tmp = taoNode(x);
    if (a == NULL)
        a = tmp;
    else
    {
        tmp->next = a;
        a->pre = tmp;
        a = tmp;
    }
}

void chenCuoi(node &a, int x)
{
    node tmp = taoNode(x);
    if (a == NULL)
        a = tmp;
    else
    {
        node p = a;
        while (p->next != NULL)
            p = p->next;
        p->next = tmp;
        tmp->pre = p;
    }
}
void chenGiua(node a, int x, int pos)
{
    node tmp = taoNode(x);
    if (a == NULL)
        a = tmp;
    else
    {
        if(pos==0){
            
        }
    }
}
void xuat(node a)
{
    while (a != nullptr)
    {
        cout << a->data << " ";
        a = a->next;
    }
}
int main()
{
    node head = NULL;
    for (int i = 1; i <= 5; i++)
    {
        int tmp;
        cin >> tmp;
        chenCuoi(head, tmp);
    }
    xuat(head);
}
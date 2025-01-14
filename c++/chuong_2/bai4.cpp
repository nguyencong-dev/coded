#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node()
    {
        data = 0;
        next = 0;
    }
    Node(int data, Node *next = NULL)
    {
        this->data = data;
        this->next = next;
    }
};
typedef Node *node;
node taoNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->next = NULL;
    return tmp;
}
void them_dau(node &a, int x)
{
    node tmp = taoNode(x);
    if (a == NULL)
        a = tmp;
    else
    {
        tmp->next = a;
        a = tmp;
    }
}
void them_cuoi(node &a, int x)
{
    node tmp = taoNode(x);
    if (a == nullptr)
        a = tmp;
    else
    {
        node p = a;
        while (p->next != nullptr)
            p = p->next;
        p->next = tmp;
    }
}
void PrintfSLL(node a)
{
    while (a != NULL)
    {
        cout << a->data << " ";
        a = a->next;
    }
}
void them_phuhop(node &a, int v)
{
    node tmp = taoNode(v);
    if (a == NULL)
        a = tmp;
    else if (v < a->data)
    {
        tmp->next = a;
        a = tmp;
    }
    else
    {
        node p = a;
        while (p->next != NULL && v < p->data)
        {
            p = p->next;
        }
        tmp->next = p->next;
        p->next = tmp;
    }
}
int Size(node a)
{
    int cnt = 0;
    while (a != nullptr)
    {
        cnt++;
        a = a->next;
    }
    return cnt;
}
void themgiua(node &a, int pos, int x)
{
    if (pos <= 0 || pos > Size(a) + 1)
        return;
    else if (pos == 1)
        them_dau(a, x);
    else if (pos == Size(a) + 1)
        them_cuoi(a, x);
    else
    {
        node tmp = a;
        for (int i = 1; i < pos - 1; i++)
        {
            tmp = tmp->next;
        }
        node p = taoNode(x);
        p->next = tmp->next;
        tmp->next = p;
    }
}
bool tim(node a, int x)
{
    while (a != NULL)
    {
        if (a->data = x)
            return true;
        a = a->next;
    }
    return false;
}
void xoa_dau(node &a)
{
    if (a == NULL)
        return;
    else
    {
        node tmp = a;
        a = a->next;
        delete tmp;
    }
}
void xoa_cuoi(node &a)
{
    node truoc = NULL, sau = a;
    while (sau->next != NULL)
    {
        truoc = sau;
        sau = sau->next;
    }
    if (truoc == NULL)
        xoa_dau(a);
    else
    {
        truoc->next = NULL;
        delete sau;
    }
}
void xoa_giua(node &a, int pos)
{
    if (pos == 0 || pos > Size(a) || a == NULL)
        return;
    else if (pos == 1)
        xoa_dau(a);
    else if (pos == Size(a))
        xoa_cuoi(a);
    else
    {
        node truoc = NULL, sau = a;
        for (int i = 1; i < pos; i++)
        {
            truoc = sau;
            sau = sau->next;
        }
        truoc->next = sau->next;
        delete sau;
    }
}
int vitri(node a, int x)
{
    int cnt = 0;
    while (a != NULL)
    {
        cnt++;
        if (a->data == x)
            return cnt;
        a = a->next;
    }
    return 0;
}
void xoa_tim(node a, int x)
{
    if(vitri(a,x))
        xoa_giua(a,vitri(a,x));
    else
        return;
}
int main()
{
    node head = nullptr;
    for (int i = 0; i < 5; i++)
    {
        int tmp;
        cin >> tmp;
        them_cuoi(head, tmp);
    }
    // int x;
    // cin >> x;
    // them_phuhop(head, x);
    // PrintfSLL(head);
    // int x;
    // cin>>x;
    // int pos;cin>>pos;
    // themgiua(head,pos,x);
    // PrintfSLL(head);
    // int k;
    // cin>>k;
    // cout<<tim(head,k);
    // xoa_dau(head);
    // xoa_cuoi(head);
    cout << "nhap phan tu can xoa: ";
    int x;
    cin >> x;
    xoa_tim(head,x);
    PrintfSLL(head);    
}
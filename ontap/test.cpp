#include <iostream>
using namespace std;
struct NodeWord
{
    string word;
    NodeWord *next;
};
typedef NodeWord *nodeword;
struct Node
{
    nodeword nhanh;
    char kitu;
    Node *next;
};
typedef Node *node;
nodeword taoNodeW(string s)
{
    nodeword tmp = new NodeWord();
    tmp->word = s;
    tmp->next = nullptr;
    return tmp;
}
node taoNode(char c, nodeword nhanh)
{
    node tmp = new Node();
    tmp->kitu = c;
    tmp->nhanh = nhanh;
    tmp->next = nullptr;
    return tmp;
}

void chendauW(string s, nodeword &nhanh)
{
    nodeword tmp = taoNodeW(s);
    if (nhanh == nullptr)
        nhanh = tmp;
    else{
        tmp->next = nhanh;
        nhanh = tmp;
    }
}

void Insert(char c, string s, node &head)
{
    nodeword tmp = taoNodeW(s);
    if (head == nullptr)
    {
        node p = taoNode(c, tmp);
        head = p;
    }
    else
    {
        bool check = false;
        node p = head;
        while (p != nullptr)
        {
            if (p->kitu == c)
            {
                check = true;
                break;
            }
            p = p->next;
        }
        if (check)
        {
            chendauW(s,p->nhanh);
        }
        else
        {
            node tmp1 = taoNode(c, tmp);
            tmp1->next = head;
            head = tmp1;
        }
    }
}
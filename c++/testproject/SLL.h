#include <iostream>
#include <cmath>
using namespace std;
struct Node
{
    int data;
    Node *next;
    Node()
    {
        data = 0;
        next = nullptr;
    }
    Node(int x, Node *ptr = nullptr)
    {
        data = x;
        next = ptr;
    }
};
typedef Node *node;
struct listNode
{
    int count(node head)
    {
        int cnt = 0;
        while (head != nullptr)
        {
            cnt++;
            head = head->next;
        }
        return cnt;
    }

    void addToHead(node &head, int x)
    {
        if (head == nullptr)
            head = new Node(x);
        else
        {
            head = new Node(x, head);
        }
    }

    void addToTail(node &head, int x)
    {
        if (head == nullptr)
            head = new Node(x);
        else
        {
            node p = head;
            while (p->next != nullptr)
            {
                p = p->next;
            }
            p->next = new Node(x);
        }
    }

    void addToMid(node &head, int x, int pos)
    {
        if (head == nullptr)
            addToHead(head, x);
        else
        {
            if (pos < 0 || pos > count(head) + 1)
                return;
            else
            {
                node truoc = nullptr, sau = head;
                for (int i = 1; i < pos; i++)
                {
                    truoc = sau;
                    sau = sau->next;
                }
                if(truoc==nullptr)
                    addToHead(head,x);
                else
                    {
                        node NewNode =new Node(x);
                        NewNode->next=sau;
                        truoc->next=NewNode;
                    }
            }
        }
    }
    void duyetList(node head)
    {
        while (head != nullptr)
        {
            cout << head->data << " ";
            head = head->next;
        }
    }
     bool checkInNode(int value,node head){
        while(head!=nullptr){
            if(value == head->data)
            {
                return true;
                head = head->next;
            }
        }
        return false;
    }
};
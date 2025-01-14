#include <iostream>
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
                if (truoc == nullptr)
                    addToHead(head, x);
                else
                {
                    node NewNode = new Node(x);
                    NewNode->next = sau;
                    truoc->next = NewNode;
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
    bool checkInNode(int value, node head)
    {
        while (head != nullptr)
        {
            if (value == head->data)
            {
                return true;
            }
            head = head->next;
        }
        return false;
    }
    void deleteNode(node &head, int x)
    {
        node truoc = nullptr, sau = head;
        while (sau->data != x && sau->next != nullptr)
        {
            truoc = sau;
            sau = sau->next;
        }
        if (truoc == nullptr)
            return;
        else
        {
            if (truoc->next = nullptr)
                head = head->next;
            else
                truoc->next = sau->next;
            delete sau;
        }
    }
};
struct hash_table
{
    listNode option;
    int hash(int key, int cap)
    {
        return key % cap;
    }
    void addKey(int key, int cap, node table[])
    {
        int bin = hash(key, cap);
        option.addToHead(table[bin], key);
    }
    void duyetTableBin(int key, int cap, node table[])
    {
        int bin = hash(key, cap);
        option.duyetList(table[bin]);
    }
    int findKey(int key, node table[], int cap)
    {
        int bin = hash(key, cap);
        if (option.checkInNode(key, table[bin]) == true)
            return true;
        else
            return false;
    }
    void duyetAllHead(int cap, node table[])
    {
        for (int i = 0; i < cap; i++)
        {
            if (table[i] != nullptr)
            {
                cout << "node [" << i << "] la: ";
                option.duyetList(table[i]);
                cout << endl;
            }
            else
                cout << "node [" << i << "] rong" << endl;
        }
    }
    int countHead(int cap, int key, node table[])
    {
        int bin = hash(key, cap);
        return option.count(table[bin]);
    }
    void deleteHead(int cap, int key, node table[])
    {
        int bin = hash(key, cap);
        option.deleteNode(table[bin], key);
    }
};

int main()
{
    int cap;
    cin >> cap;
    hash_table h_table;
    node table[101] = {nullptr};
    for (int i = 0; i < cap; i++)
    {
        int key;
        cin >> key;
        h_table.addKey(key, cap, table);
    }
    int key;
    cin >> key;
    // h_table.duyetTableBin(key, cap, table);
    // cout << endl;
    // cout << h_table.findKey(5, table, cap) << endl;
    h_table.duyetAllHead(cap, table);
    // cout << h_table.countHead(cap, 5, table);
    h_table.deleteHead(cap, key, table);
    h_table.duyetAllHead(cap, table);
}
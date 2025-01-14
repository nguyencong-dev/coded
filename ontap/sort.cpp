#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;
struct Node
{
    int data;
    Node *left;
    Node *right;
};
typedef Node *node;

// tao node
node makerNode(int x)
{
    node root = new Node();
    root->data = x;
    root->left = nullptr;
    root->right = nullptr;
    return root;
}
void them(int x, node &root)
{
    if (root != nullptr)
    {
        if (root->data == x)
            return;
        if (x > root->data)
            them(x, root->right);
        else
            them(x, root->left);
    }
    else
    {
        node tmp = makerNode(x);
        root = tmp;
    }
}
void NRL(node head)
{
    if (head != nullptr)
    {
        cout << head->data << " ";
        NRL(head->left);
        NRL(head->right);
    }
}
int chan(node root)
{
    if (root == nullptr)
    {
        return 0;
    }
    else
    {
        if (root->data % 2 == 0)
            return 1 + chan(root->left) + chan(root->right);
        else
          chan(root->left)+chan(root->right);
    }
}
int main()
{
    node root = nullptr;
    for (int i = 0; i < 4; i++)
    {
        int tmp;
        cin >> tmp;
        them(tmp, root);
    }
    // NRL(root);
    cout<<endl;
    cout<<chan(root);
}
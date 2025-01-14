#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *left;
    Node *right;
    Node()
    {
        data = 0;
        left = 0;
        right = 0;
    }
};
typedef Node *node;
node makeNode(int x)
{
    node tmp = new Node();
    tmp->data = x;
    tmp->left = nullptr;
    tmp->right = nullptr;
    return tmp;
}
struct Tree
{
    void Insertion(node &root, int x)
    {
        if (root == nullptr)
            root = makeNode(x);
        else
        {
            node tmp=root;
            while (tmp != nullptr)
            {
                if (x > tmp->data)
                {
                    if (tmp->right == nullptr)
                    {
                       tmp->right = makeNode(x);
                        return;
                    }
                    tmp = tmp->right;
                }
                else if (x <tmp->data)
                {
                    if (tmp->left == nullptr)
                    {
                       tmp->left = makeNode(x);
                        return;
                    }
                   tmp = tmp->left;
                }
                else
                    return;
            }
        }
    }
    bool find(int x,node root){
        if(root->data==x)
            return true;
        else{
            while(root!=nullptr){
                if(x>root->data)
                    root=root->right;
                else if(x<root->data)
                    root=root->left;
                else
                    return true;
            }
        }
        return false;
    }
    void visit(node root)
    {
        cout << root->data << " ";
    }

    void duyetNLR(node root)
    {
        if (root != nullptr)
        {
            visit(root);
            duyetNLR(root->left);
            duyetNLR(root->right);
        }
    }
};
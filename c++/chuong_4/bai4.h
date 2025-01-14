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
struct tree
{
    void InsertNode(int x, node &root)
    {
        node tmp = makeNode(x);
        if (root == nullptr)
            root = tmp;
        else
        {
            if (x > root->data)
                return InsertNode(x, root->right);
            else
            {
                if (x < root->data)
                    return InsertNode(x, root->left);
                else
                    return;
            }
        }
    }
    bool seach(int x, node root)
    {
        if (root == nullptr)
            return false;
        if (root->data == x)
            return true;
        else
        {
            if (x > root->data)
                return seach(x, root->right);
            else
                return seach(x, root->left);
        }
    }
    void NLR(node root)
    {
        if (root != nullptr)
        {
            cout << root->data << " ";
            NLR(root->left);
            NLR(root->right);
        }
    }
    void LNR(node root)
    {
        if (root != nullptr)
        {
            LNR(root->left);
            cout << root->data << " ";
            LNR(root->right);
        }
    }
    void LRN(node root)
    {
        if (root != nullptr)
        {
            LRN(root->left);
            LRN(root->right);
            cout << root->data << " ";
        }
    }
    void count(node root, int &i)
    {
        if (root != nullptr)
        {
            i++;
            count(root->left, i);
            count(root->right, i);
        }
    }
    int average(node root, int count, int sum)
    {
        if (root != nullptr)
        {
            sum += root->data;
            count++;
            average(root->left, count, sum);
            average(root->right, count, sum);
        }
        return sum;
    }
};

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

// them phan tu vao cay
void Insertion(node &root, int x)
{
    if (root == nullptr)
        root = makerNode(x);
    else
    {
        if (x > root->data)
            Insertion(root->right, x);
        else if (x == root->data)
            return;
        else
            Insertion(root->left, x);
    }
}

// visit
void visit(node root)
{
    cout << root->data << " ";
}

// find
bool find(node root, int x)
{
    if (root == nullptr)
        return false;
    else if (x == root->data)
        return true;
    else if (x > root->data)
       return find(root->right, x);
    else
       return find(root->left, x);
}

// maxRight
void findMaxRight(node &deleteNode, node &replaceNode)
{
    if (replaceNode->right != nullptr)
        findMaxRight(deleteNode, replaceNode->right);
    else
    {
        deleteNode->data = replaceNode->data;
        deleteNode = replaceNode;
        replaceNode = replaceNode->left;
    }
}

// deletion
void deletion(node root, int x)
{
    if (root == nullptr)
        return;
    else if (x > root->data)
        deletion(root->right, x);
    else if (x < root->data, x)
        deletion(root->left, x);
    else
    {
        node deletedNode = root;
        if (root->left == nullptr)
            root = root->right;
        else if (root->right == nullptr)
            root = root->left;
        else
        {
            findMaxRight(deletedNode, root->left);
        }
    }
}

// duyetNLR
void duyetNLR(node root)
{
    if (root != nullptr)
    {
        visit(root);
        duyetNLR(root->left);
        duyetNLR(root->right);
    }
}

// duyetLNR
void duyetLNR(node root)
{
    if (root != nullptr)
    {
        duyetLNR(root->left);
        visit(root);
        duyetLNR(root->right);
    }
}

// duyetLRN
void duyetLRN(node root)
{
    if (root != nullptr)
    {
        duyetLRN(root->left);
        duyetLRN(root->right);
        visit(root);
    }
}
int count(node root)
{
    if (root == nullptr)
        return 0;
    else
        return 1 + count(root->left) + count(root->right);
}
double sum(node root)
{
    if (root == nullptr)
        return 0;
    else
        return root->data + sum(root->right) + sum(root->left);
}
double avergange(node root)
{
    return sum(root) / count(root);
}

// find max
int findMax(node root)
{
    if (root == nullptr)
        return -1;
    else if (root->right == nullptr)
        return root->data;
    else
         return findMax(root->right);
}

// isPrime
bool isPrime(int x)
{
    if (x < 2)
        return false;
    else
    {
        for (int i = 2; i <= sqrt(x); i++)
        {
            if (x % i == 0)
                return false;
        }
    }
    return true;
}

// countPrime
int countPrime(node root)
{
    if (root == nullptr)
        return 0;
    else
    {
        if (isPrime(root->data))
            return 1 + count(root->left) + count(root->right);
        else
          return count(root->left) + count(root->right);
    }
}
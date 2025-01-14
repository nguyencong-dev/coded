#include <iostream>
using namespace std;
struct Node
{
   int data;
   Node *next;
};
typedef Node *node;
node taoNode(int x)
{
   node tmp = new Node();
   tmp->data = x;
   tmp->next = nullptr;
   return tmp;
}
void them_dau(int x, node &a)
{
   node tmp = taoNode(x);
   if (a == nullptr)
      a = tmp;
   else
   {
      tmp->next = a;
      a = tmp;
   }
}
int xoa_cuoi(node &a)
{
   if (a == nullptr)
      return 0;
   else
   {
      node truoc = nullptr,sau = a;
      while (sau->next != nullptr)
      {
         truoc=sau;
         sau = sau->next;
      }
      int info=sau->data;
      if(truoc==nullptr)
         a=nullptr;
      else{
         truoc->next=nullptr;
      }
         delete sau;
      return info;
   }
}

int main()
{
   node head = nullptr;
   for(int i=0;i<5;i++){
      int tmp;cin>>tmp;them_dau(tmp,head);
   }
   node tmp=head;
   while(tmp!=nullptr){
      cout<<tmp->data<<" ";
      tmp=tmp->next;
   }
   cout<<xoa_cuoi(head);

}
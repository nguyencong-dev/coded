#include <iostream>
#include "../testproject/SLL.h"
using namespace std;

struct Table
{
    listNode list;
    int hash(int value)
    {
        return value % 100;
    }
    void addValue(int value, node head[]){
        int bin = hash(value);
        list.addToHead(head[bin], value);
    }
    bool checkInTable(int value,node head[]){
        int bin = hash(value);
        if(list.checkInNode(value,head[bin]))
            return true;
        else
            return false;
    }
};

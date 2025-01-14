#pragma once
#include<iostream>
using namespace std;
struct Node
{
	int data;
	Node* next;
	Node() {
		data = 0;
		next = 0;
	}
};
typedef Node* node;
struct Queue
{
	node tao_node(int x) {
		node tmp = new Node();
		tmp->data = x;
		tmp->next = nullptr;
		return tmp;
	}
	bool isEmpty(node head) {
		return head == nullptr;
	}
	void enqueue(node &head, int x) {
		node tmp = tao_node(x);
		if (head == nullptr)
			head = tmp;
		else {
			tmp->next = head;
			head = tmp;
		}
	}
	int dequeue(node &head) {
		node truoc = nullptr, sau = head;
		while (sau->next != nullptr)
		{
			truoc = sau;
			sau = sau->next;
		}
		if (truoc == nullptr)
			head = nullptr;
		else
			truoc->next = nullptr;
		int x = sau->data;
		delete sau;
		return x;
	}
	void menu() {
		cout << "======================" << endl;
		cout << "|1.kiem tra Queue rong|" << endl;
		cout << "|2.Enqueue            |" << endl;
		cout << "|3.Dequeue            |" << endl;
		cout << "======================" << endl;
	}
};
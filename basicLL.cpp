#include<iostream>

using namespace std;

class Node{
		int data;
		Node *next;
	
	Node(int data){
		this->data = data;
		this->next = NULL;
	}
	~Node(){
		int value = this->data;
		if(this->next != NULL){
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free"<<endl;
	}
}

void InsertAtHead(Node* &head, int d){
	Node* temp = new Node(d);
	temp->next = head;
	head = temp;
}

void InsertAtTail(Node* &tail, int d){
	Node* temp = new Node(d);
	tail->next = temp;
	tail = tail->next;	
}

void InsertAtPosition(Node* &tail, Node* & head,int position, int d){
	
	if(position ==1){
		InsertAtHead(head,d);
		return;
	}
	Node* temp = head;
	int c=1;
	
	while(c<position-1){
		temp = temp->next;
		c++;
	}
	
	if(temp->next == NULL){
		InsertAtTail(tail,d);
		return;
	}
	
	Node*  nodetoinsert = new Node(d);
	nodetoinsert->next = temp->next;
	temp->next = nodetoinsert;
}

void print(Node* &head){
	Node* temp = head;
	while(temp != NULL){
		cout<<temp->data<< " ";
		temp = temp->next;
	}	
	cout<<endl;	
}

void deleteNode(int position, Node* &head){
	if(position == 1){
		Node* temp = head;
		head = head->next;
		temp->next = NULL;
		delete temp;
	}
	else{
		Node* curr = head;
		Node* prev = NULL;
		int c=1;
		while(c< position){
			prev = curr;
			curr = curr->next;
			c++;
		}
		prev->next = curr->next;
		curr->next = NULL; 
		delete curr; 		
	}
}

int main(){
	
	Node* node1 = new Node(10);
	cout<< node1->data <<endl;
	
	Node* head = node1;
	Node* tail = node1;
	InsertAtHead(head,20);
	print(head);
	InsertAtHead(head,50);
	print(head);
	
	InsertAtTail(tail,5);
	print(head);
	InsertAtTail(tail,1);
	print(head);
	
	InsertAtPosition(tail,head,2,25);
	print(head);
	
	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;
	
	deleteNode(1,head);
	print(head);
	deleteNode(3,head);
	print(head);
	
	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;
	
	return 0;
}
#include<stdio.h>


int digitFrequency[10];

int main(){
 

 int n;
 scanf("%d",&n);
 
 int inVal[n];
 for (int i=0; i<n; i++){
  scanf("%d",&inVal[i]);
 }
 
 for (int i=0; i<n; i++){
  
  int limit = inVal[i];
  int counter = limit;
  
  for(int i=0; i<10; i++)
   digitFrequency[i]=0;
  
  while (limit>0){
   
   while(counter){
    digitFrequency[counter%10] ++;
    counter = counter/10;
   }
   limit --;
   counter = limit;
  }
  for(int i=0; i<9; i++)
   printf("%d ", digitFrequency[i]);
   
  printf("%d\n",digitFrequency[9]);
 }
 

 return 0;

}

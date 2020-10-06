#include<bits/stdc++.h>
using namespace std;

   string reverseWords(string s) 
    {
        stack<string> st;
        int l=s.length();
        char a[l+1];
         int i;
        for(i=0;i<l;i++)
        {
            a[i]=s[i];
        }
        a[i]='\0';

        char *c=strtok(a," ");
        while(c!=NULL)
        {
            st.push(c);
            c=strtok(NULL," ");
        }
        string str;
        while(!st.empty())
        {
            if(st.size()!=1)
            {
            string strr=st.top();
            str+=strr+" ";
            st.pop();
            }
            else
            {
            string strr=st.top();
            str+=strr;
            st.pop();
            }
        }
        
    return str;
     }

int main()
{
string s;
cin>>s;

cout<<reverseWords(s);
}
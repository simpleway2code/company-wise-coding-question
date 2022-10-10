// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

string reverseWords(string str) 

    { 

        // code here

        string output;

    vector<string>st;

    int start=0;

    int len=0;

    

    //Add . at the end of string for eaisly extrct words

    // if you not use it then last word you can't extract

    str=str+'.';

    for(int i=0; i<str.size(); i++){

        // . found store in a temp string , 

        // then store temp string to a vector

        if(str[i]=='.'){

        

          string temp=str.substr(start,len);

            st.push_back(temp);

            start=i+1;

            len=0;

         

        }else{

            len++;

        }

    }

  

  reverse(st.begin(), st.end());  

    for(auto it :st){

       

output=output+it+'.';

        

    }

 

output[str.size()-1]='\0';

return output;

    } 
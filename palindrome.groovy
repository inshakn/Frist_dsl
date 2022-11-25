
int x =542
String rev="";
String s = Integer.toString(x);
        char[] num = s.toCharArray();
        
     
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            rev+=num[i];
        }
        '''if(s==rev)
        print(true);
        else
        print(false);'''
        print(rev)

import java.util.*;
class codeforces_water {
   public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            String[] words= new String[n];
            for(int i=0; i<=n; i++){
              words[i]=sc.nextLine().trim();
            }

            for(String w: words){
              System.out.println(w);
            }

            String[] ans= new String[n];
            String a;

            for(int i=0; i<n; i++){
              if(words[i].size()<=10){
                System.out.println(words[i]);
              }else{
                a=words[i].characterAt(i)+ (words[i].size())-2 + words[i].characterAt(words[i].size()-1);
                System.out.println(a);
              }
            }
     
   } 
}


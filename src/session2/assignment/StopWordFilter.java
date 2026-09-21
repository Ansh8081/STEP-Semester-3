package session2.assignment;
public class StopWordFilter{
    static void printFilteredWordFrequency(String feedback){
        String filler[]={"the","was","and","a","is","of","in"};
        int i,j,k,uniq=0;
        String[] normal=feedback.toLowerCase().replace(",","").replace(".", "").split("\\s+");
        int[] count=new int[normal.length];
        String[] unique=new String[normal.length];
        for(i=0;i<normal.length;i++){
            int l=0;
            for(k=0;k<filler.length;k++){
                if(filler[k].equals(normal[i]))
                    l++;
            }
            if(l==0){
                int a=0;
                count[uniq]=1;
                boolean repeat=false;
                if(uniq!=0){
                    while(a<uniq){
                        if(normal[i].equals(unique[a])){
                            repeat=true;
                        }
                        a++;
                    }
                }
                if(!repeat){
                    for(j=i+1;j<normal.length;j++){
                        if(normal[j].equals(normal[i]))
                            count[uniq]++;
                    }
                    unique[uniq]=normal[i];
                    uniq++;
                }
            }
        }
        for(j=0;j<uniq;j++){
            for(k=j+1;j<uniq;j++){
                if(count[j]<count[k]){
                    count[j]=count[j]+count[k];
                    count[k]=count[j]-count[k];
                    count[j]=count[j]-count[k];
                    String temp;
                    temp=unique[k];
                    unique[k]=unique[j];
                    unique[j]=temp;
                }
            }
        }
        for(i=0;i<uniq;i++){
            System.out.println(unique[i] + " : " + count[i]);
        }
    }
    public static void main(String[] args){
        String feedback="The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(feedback);
    }
}

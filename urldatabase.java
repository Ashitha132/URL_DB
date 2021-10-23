import java.util.*;

class CURL
{
    int countt;
    String url_given,unique_key;
    CURL()
    {
        url_given=" ";
        unique_key=" ";
        countt=0;
    }
    CURL(String u,String k,int c)
    {
        url_given=u;
        unique_key=k;
        countt=c;
        
    }
}

class urldatabase
{
    public static void main(String arg[])
    {
    
        CURL uarray[] = new CURL[10];
        int acount=0;
        String jsondatastring;
        Scanner sc= new Scanner(System.in);
        String[] inputt =new String[2];
        System.out.println("Commands here [ storeurl,get,count,list ]");
        do
        {
        
        inputt=sc.nextLine().split(" ");
            
        switch(inputt[0])
        {
            case "storeurl":
                            String uId = UUID.randomUUID().toString();
                            uarray[acount]=new CURL(inputt[1],uId,0);
                            acount++;
            
                            break;
            case "get"     :
                            for(int k=0;k<acount;k++)
                            {
                            
                            if((uarray[k].url_given).equals(inputt[1]))
                            {
                                uarray[k].countt+=1;
                                System.out.println("UID ="+uarray[k].unique_key);
                            }
                            }
                            
                            
                            break;
            case "count"   :try
                            {
                            for(int k=0;k<acount;k++)
                            {
                            
                            if((uarray[k].url_given).equals(inputt[1]))
                            {
                                
                                System.out.println("COUNT ="+uarray[k].countt);
                            }
                            }
                            }catch (NullPointerException e) {
                                  
                                 }
                            break;
            case "list"    :jsondatastring="{urls :{";
                            for(int k=0;k<acount;k++)
                            {
                            jsondatastring+="\"";
                            jsondatastring+=uarray[k].url_given;
                            jsondatastring+="\" : { \"count \": ";
                            jsondatastring+=uarray[k].countt;
                            jsondatastring+="}";
                            if(k!=acount-1)
                            jsondatastring+=",";
                            
                            }
                            jsondatastring+="}}";
                            System.out.println(jsondatastring);
                           
                            break;
            
        }
    
           
            
        }while(!inputt[0].equals("exit"));
        
        
        
        
        
    }
}

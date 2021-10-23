import java.util.*;

class CURL // created class with url,uid,count to store the data
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
    
        CURL uarray[] = new CURL[10];//created array of objects
        int acount=0;
        String jsondatastring;
        Scanner sc= new Scanner(System.in);
        String[] inputt =new String[2];
        System.out.println("Commands here [ storeurl,get,count,list ]");
        do
        {
        
        inputt=sc.nextLine().split(" "); // splitted the input to command and url
            
        switch(inputt[0]) // checking the command with following cases
        {
            case "storeurl":
                            String uId = UUID.randomUUID().toString(); // creating unique id randomly
                            uarray[acount]=new CURL(inputt[1],uId,0); // pushing the data url,uid,count initialised to 0 to the object
                            acount++;
            
                            break;
            case "get"     :
                            for(int k=0;k<acount;k++)
                            {
                            
                            if((uarray[k].url_given).equals(inputt[1]))
                            {
                                uarray[k].countt+=1;
                                System.out.println("UID ="+uarray[k].unique_key); // printing the unique key of matching url
                            }
                            }
                            
                            
                            break;
            case "count"   :try
                            {
                            for(int k=0;k<acount;k++)
                            {
                            
                            if((uarray[k].url_given).equals(inputt[1]))
                            {
                                
                                System.out.println("COUNT ="+uarray[k].countt); // printing the latest  usage count of mathing url
                            }
                            }
                            }catch (NullPointerException e) {
                                  
                                 }
                            break;
            case "list"    :jsondatastring="{urls :{"; // creating list of all url and count as JSON
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
            default        :System.out.println("Invalid command");
        }
    
           
            
        }while(!inputt[0].equals("exit"));
        
        
        
        
        
    }
}

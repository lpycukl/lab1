import java.util.*;


public class lab1
{

    public static void main(String[] argc)
    {
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        String [] word = st.toLowerCase().replaceAll("\\s","").split("");

        Map<String,Integer>map=new HashMap<>();
        for(String s:word)
        {
            if(!s.isEmpty())
            {
                Integer count = map.get(s);
                if(count==null)count=0;
                map.put(s,++count);
            }
        }


        System.out.print(map.toString());
    }
}
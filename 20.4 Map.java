import java.util.Hashtable;
import java.util.Map;

public class Demo {
    
        public static void main(String[] args){   
            // Map<String, Integer> students=new HashMap<>();
            Map<String, Integer> studentsMap=new Hashtable<>();
            studentsMap.put("jhon", 6);
            studentsMap.put("JeanClaude", 5);
            studentsMap.put("Steeve", 8);
            studentsMap.put("Bernard", 2);

            System.out.println(studentsMap.keySet());

            for(String key : studentsMap.keySet())
            {
                System.out.println(key + ":" + studentsMap.get(key));
   
            }
        
            

           
        }
    }
    













}

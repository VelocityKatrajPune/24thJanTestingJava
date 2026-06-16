package logicalProgram;

public class FindDuplicateElementsInStringArray {
    public static void main(String[] args) {

        String ar[]={"api", "sql", "java", "api", "java", "selenium"};
        int count=0;

        for(int i=0;i<=ar.length-1;i++)
        {
            for(int j=i+1;j<=ar.length-1;j++)
            {
                if(ar[i].equals(ar[j]))
                {
                    System.out.println("duplicate found "+ar[i]);
                    count++;
                }
            }
        }
        System.out.println("total duplicates are "+count);

    }
}

public class Labled_continue_statement {
    public static void main(String[] args) {
        Harshit:
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(i==2)
                {
                    System.out.println("Hey Raju !!");
                    continue Harshit;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class Labled_break_statement {
    public static void main(String[] args) {
        Harshit:
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(i==2)
                {
                    break Harshit;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


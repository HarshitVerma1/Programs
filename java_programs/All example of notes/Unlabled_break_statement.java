public class Unlabled_break_statement {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(i==2)
                {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// For-each loop use
/*public class Unlabled_break_statement {
    public static void main(String[] args) {
        int i=0;
        int num[][]=new int[5][5];
        for (int m[]:num)
        {
            for (int j:m)
            {
                if(i==2)
                {
                    break;
                }
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}
*/
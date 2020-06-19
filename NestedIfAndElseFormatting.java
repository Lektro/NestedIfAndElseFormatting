public class NestedIfAndElseFormatting {
    public static void main(String[] args) {
        int score = 50;  // Change the variable here.

        // Good Code
        if (score >= 90)
            System.out.print("A");
        else if (score >= 80)
            System.out.print("B");
        else if (score >= 70)
            System.out.print("C");
        else if (score >= 60)
            System.out.print("D");
        else
            System.out.print("F");

        /*
        EXAMPLE BAD CODE FORMATTING, works perfect but is not preferred formatting.

        if (score >= 90)
            System.out.print("A");
        else
            if (score >= 80)
                System.out.print("B");
            else
                if (score >= 70)
                    System.out.print("C");
                else
                    if (score >= 60)
                        System.out.print("D");
                    else
                        System.out.print("F");
         */
    }
}

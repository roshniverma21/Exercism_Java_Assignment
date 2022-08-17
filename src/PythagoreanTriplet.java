public class PythagoreanTriplet
{
    public static void main(String args[]) {
        PythagoreanTriplet pt = new PythagoreanTriplet();
        pt.pythagoreanTriplet(1000);
    }
    public void pythagoreanTriplet(int n)
    {
        int a,b,c;
        for (a=1; a<(n/3); a++)
        {
            for (b=a+1; b<n; b++)
            {
                c=n-(a+b);
                if (b>=c)
                {
                    break;
                }
                if (((a*a) + (b*b)) == c*c)
                {
                    System.out.println(+a+","+b+","+c);
                }
            }
        }
    }
}
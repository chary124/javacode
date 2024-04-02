class Division{
    public static void main(String[] args)
    {
        int d1 = 14;
        int d2 = 3;
        int count = 0;
        while(d1>=d2)
        {
            d1 -= d2;
            count++;
        }
        
        System.out.println(count);
    }
}
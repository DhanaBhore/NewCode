class SwapValues{
    public static void main(String[] args){

            int i = 10;
            int j = 7;

            i = i - j;
            j= i + j;
            i = j * (j-i)/10;

            System.out.println(i);
            System.out.println(j);


    }
}

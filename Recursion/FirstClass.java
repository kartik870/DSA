public class FirstClass
{
    public static void main(String[] args) 
    {
        int nums[] = {1,4,4,7,5};
        // factorial sat = new factorial();
        // System.out.println(sat.fact(5));

        //Fibonaci sat = new Fibonaci();
        //System.out.println(sat.fib(19));

        // ArraySorted sat = new ArraySorted();
        // System.out.println(sat.isSorted(nums,nums.length));

        LinearSearch sat = new LinearSearch();
        System.out.println(sat.search(nums,5));

    }
}

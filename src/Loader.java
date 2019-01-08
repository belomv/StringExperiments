public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася зарабатывает 5000 рублей. Петя - 7300 рублей, а Маша - 3500 рублей.";
        int indexOf1 = text.indexOf("зарабат");
        int indexOf2 = text.indexOf("руб");

        System.out.println(indexOf1);
        System.out.println(text.substring(indexOf1+12, indexOf2).trim());

//        for (int i = 0; i < 512; i++)
//        {
//            System.out.println("Code " + i + ": " + (char)i);
//        }
    }
}

public class CurrencyNotes {
    public static void main(String[] args) {
        int currency[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int amount = 5726;

        for (int i = 0; i < currency.length; i++)
        {
            //System.out.println(i);
            int rem = amount % currency[i];
            System.out.println(rem);
            //System.out.println(amount);
            //System.out.println(currency[i]);
            int number_of_currency = amount / currency[i];
            System.out.println(number_of_currency);
            amount = rem;
            System.out.println(amount);
            System.out.println(currency[i] + " * " + number_of_currency + " = " + (currency[i] * number_of_currency));

        }
    }
    
}

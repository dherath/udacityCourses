public class CreditCardTester
{
    public static void main(String[] args)
    {
        CreditCard card = new CreditCard(12345);
        System.out.println("Actual: " + card.sumCertainDigits());
        System.out.println("Expected: 9");

        CreditCard anotherCard = new CreditCard(135792);
        System.out.println("Actual: " + anotherCard.sumCertainDigits());
        System.out.println("Expected: 12");

        CreditCard validCard = new CreditCard(4417123456789113L);
        System.out.println("Actual: " + validCard.isValid());
        System.out.println("Expected: true");

        CreditCard invalidCard = new CreditCard(4417123456879113L);
        System.out.println("Actual: " + invalidCard.isValid());
        System.out.println("Expected: false");

        CreditCard easyToRememberValidCard = new CreditCard(4111111111111111L);
        System.out.println("Actual: " + easyToRememberValidCard.isValid());
        System.out.println("Expected: true");
    }
}

package equalsAndhascode;

import java.util.Objects;

public class Step1 {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);

        System.out.println(balanced);

        Money cash = new Money(42, "USD");
        Voucher voucher = new Voucher(42, "USD", "Amazon");

        System.out.println(voucher.equals(cash)); // As expected.
        System.out.println(cash.equals(voucher)); // That's wrong.
    }
}


class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(amount, currencyCode);
//    }
}

class Voucher {

    private Money value;
    private String store;

    Voucher(int amount, String currencyCode, String store) {
        this.value = new Money(amount, currencyCode);
        this.store = store;
    }




    // other methods

}
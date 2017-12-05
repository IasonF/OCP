package Practice8;

import org.junit.Test;

import java.util.List;
import java.util.function.*;

public class SalesTxnTest {
    @Test
    public void CalcTest1() {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        tList.forEach(System.out::println);
        SalesTxn first = tList.get(0);
        Predicate<SalesTxn> massSales =
                salesTxn -> salesTxn.getState().equals(State.MA);

        System.out.println("\n== Sales - Stream");
        tList.stream()
                .filter(massSales)
                .forEach(SalesTxn::printSummary);

        System.out.println("\n== Sales - Method Call");
        for (SalesTxn t : tList
                ) {
            if (massSales.test(t))
                t.printSummary();
        }

        Consumer<SalesTxn> buyerConsumer = salesTxn ->
                System.out.println("Id: " + salesTxn.getTxnId()
                + " Buyer: " + salesTxn.getBuyerName());

        System.out.println("=== Buyers - Lambda");
        tList.forEach(buyerConsumer);

        System.out.println("== First buyer - Method");
        buyerConsumer.accept(first);

        Function<SalesTxn, String> buyerFunction =
                salesTxn -> salesTxn.getBuyerName();
        System.out.println("\n===First Buyer");
        System.out.println(buyerFunction.apply(first));

        Supplier<SalesTxn> txnSupplier = () ->
                new SalesTxn.Builder()
                .txnId(101)
                .salesPerson("John Adam")
                .build();

        tList.add(txnSupplier.get());
        System.out.println("\n== TList after supplier addition");
        tList.forEach(SalesTxn::printSummary);

        ToDoubleFunction<SalesTxn> discountFunction =
                t -> t.getTransactionTotal() * t.getDiscountRate();
        System.out.println(discountFunction.applyAsDouble(first));
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        double t2 = 0; //  PriceCo code here

        System.out.printf("%nPriceCo Total: $%,9.2f%n", t2);

        int c2 = 0; // PriceCo count code here

        System.out.printf("PriceCo Transactions: %,6d%n", c2);

    }

}
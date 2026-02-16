
import java.util.*;

public class Comparablee{
    public static void main(String args[]){
        HashSet<Stock> hs = new HashSet<Stock>();
        TreeSet<Stock> ts = new TreeSet<Stock>();

        hs.add(new Stock("AAPL",150));
        hs.add(new Stock("AAPL",155));

        ts.add(new Stock("AAPL",150));
        ts.add(new Stock("AAPL",155));

        System.out.println(ts.size());
        System.out.println(hs.size());
        System.out.println(ts);
    }
}

class Stock implements Comparable<Stock>{
    String symbol;
    double price;

    public Stock(String symbol, double price){
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Stock[symbol=" + symbol + ", price=" + price + "]";
    }

    // Used by TreeSet to compare objects
    @Override
    public int compareTo(Stock other){
        return this.symbol.compareTo(other.symbol);
    }

    // Used by HashSet to check equality
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Stock)) return false;

        Stock other = (Stock) obj;
        return this.symbol.equals(other.symbol);
    }

    // Used by HashSet for hashing
    @Override 
    public int hashCode(){
        return this.symbol.hashCode();
    }
}

/*
===================== EXPLANATION =====================

1) compareTo() → Used by TreeSet

- TreeSet does NOT use equals() or hashCode().
- TreeSet uses compareTo() to:
    a) Maintain sorted order
    b) Determine duplicates

- If compareTo() returns:
      0  → Objects are considered duplicates
     <0  → this < other
     >0  → this > other

In your code:
compareTo() compares only symbol.

So:
new Stock("AAPL",150)
new Stock("AAPL",155)

symbol is same → compareTo returns 0 → duplicate → not added

Therefore:
ts.size() = 1


-------------------------------------------------------

2) equals() → Used by HashSet

HashSet checks duplicates using:
   equals() + hashCode()

In your equals():
You compare only symbol.

So:
new Stock("AAPL",150)
new Stock("AAPL",155)

symbol is same → equals() returns true

Therefore HashSet treats them as duplicates.


-------------------------------------------------------

3) hashCode() → Used by HashSet

HashSet internal working:

Step 1: hashCode() decides bucket
Step 2: equals() checks equality inside bucket

Since both objects have:
symbol = "AAPL"

hashCode() returns same value
equals() returns true

So second object is NOT added.

Therefore:
hs.size() = 1


-------------------------------------------------------

4) Why output is:

1
1
[Stock[symbol=AAPL, price=150.0]]

TreeSet stores only one element.
HashSet stores only one element.
In TreeSet, first inserted element is kept.


-------------------------------------------------------

IMPORTANT CONCEPT:

HashSet → Uses equals() + hashCode()
TreeSet → Uses compareTo()

If compareTo() is inconsistent with equals(),
it can create unexpected behavior.

Here both compare only symbol,
so behavior is consistent.


=======================================================
*/ 

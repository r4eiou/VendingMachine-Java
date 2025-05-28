/**
 * This class acts like a storage for all transaction made by the machine, both regular and special.
 */
public class Transaction {

    /**
     *  This constructor initializes the item and amount bought by the user
     *
     * @param amount amount paid by the user
     * @param item item bought by the user
     */
    public Transaction(Item item, float amount)
    {
        itemBought = item;
        amountPaid = amount;
    }


    public Item getItemBought()
    {
        return itemBought;
    }

    public float getAmountPaid()
    {
        return amountPaid;
    }

    private Item itemBought;
    private float amountPaid;
}

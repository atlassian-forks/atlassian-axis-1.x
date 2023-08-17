package test.holders.holders;

import test.holders.Book;

public final class BookHolder implements javax.xml.rpc.holders.Holder {
    public Book value;

    public BookHolder() {
    }

    public BookHolder(Book value) {
        this.value = value;
    }

}

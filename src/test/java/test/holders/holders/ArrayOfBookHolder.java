package test.holders.holders;

import test.holders.ArrayOfBook;

public final class ArrayOfBookHolder implements javax.xml.rpc.holders.Holder {
    public ArrayOfBook value;

    public ArrayOfBookHolder() {
    }

    public ArrayOfBookHolder(ArrayOfBook value) {
        this.value = value;
    }

}

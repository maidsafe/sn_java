package net.maidsafe.api.model;

import com.sun.jna.Pointer;

public class MDataEntry {
    private Pointer key;
    private long keyLen;
    private Pointer data;
    private long dataLen;

    public MDataEntry(Pointer key, long keyLen, Pointer data, long dataLen) {
        this.key = key;
        this.keyLen =keyLen;
        this.data = data;
        this.dataLen = dataLen;
    }

    public Pointer getKey() {
        return key;
    }

    public Pointer getData() {
        return data;
    }
}

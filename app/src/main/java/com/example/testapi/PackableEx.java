package com.example.testapi;

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}

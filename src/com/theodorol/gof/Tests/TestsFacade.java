package com.theodorol.gof.Tests;

import com.theodorol.gof.Facade.Facade;

public class TestsFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Duck", "123456780");
    }
}

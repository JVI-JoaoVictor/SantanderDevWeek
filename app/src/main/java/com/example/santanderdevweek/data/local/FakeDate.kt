package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeDate {
    fun getLocalData(): Conta {
        val cliente = Cliente("João")
        val cartao = Cartao("4334")
        return Conta(
            "441123-5",
            "6554",
            "R$ 245.342,50",
            "R$ 4.000.000,00",
            cliente,
            cartao
        );
    }





}
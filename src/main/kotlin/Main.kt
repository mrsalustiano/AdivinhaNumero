package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val rnds = (0..10).random();
    var tentativas = 0;
    var continuar = true;

    println(rnds)
    println("Sistema de Advinhação de Numemos de 0 a 10")
    while (continuar) {
        print("Digite um número: ")
        val num = readLine()!!.toInt()
        if (num > 10 || num < 0) {
            println("Número inválido")
        } else {
            tentativas++
            if (num == rnds) {
                println("Parabéns você acertou o número em $tentativas tentativas")
                continuar = false
            } else {
                if (num > rnds)
                    println("Você errou, o número é menor que $num")
                else
                    println("Você errou, o número é maior que $num")
                println("Tentativas: $tentativas")
            }
        }
        if (tentativas == 10) {
            println("Você perdeu o número era $rnds")
            continuar = false
        }
    }
}

package br.edu.umfg.calculadora

import java.lang.Exception
import java.lang.IllegalArgumentException

private val operacoesAceitas = arrayOf("+","-","*","/")

// Ler dois valores decimais
// Ler a operação
// Imprimir o resultado

fun main() {
    println("Bem-Vindo a calculadora em Kotlin \n")

    val a = readDouble()

    val b = readDouble("Digite o segundo valor:")

    var operacao = readOperacao()

    when (operacao) {
        "+" -> println("O resultado da soma de $a e $b é ${a + b}")
        "-" -> println("O resultado da subtração de $a e $b é ${a - b}")
        "*" -> println("O resultado da multiplicação de $a e $b é ${a * b}")
        "/" -> println("O resultado da divisão de $a e $b é ${a / b}")

    }
}

fun readDouble(label: String = "Digite o primeiro valor:"): Double {
    while(true) {
        try {
            println(label)
            return readln().toDouble()
        } catch (ex: Exception){
            println("Valor inválido!")
        }
    }
}

fun readOperacao(): String{
    while(true) {
        try {
            println("Escolha uma das opções: (+,-,*,/)")
            val operacao = readln()
            if (operacao !in operacoesAceitas) {
                throw IllegalArgumentException("Operação inválida!")
            }
            return operacao
        }catch (ex: Exception){
            println("Operação inválida!")
        }
    }
}




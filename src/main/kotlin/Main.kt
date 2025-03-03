package org.example
import java.util.*
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*
        Un edificio tiene un sistema de control de acceso basado en identificaciones.
        Requisitos:
        •	Pedir al usuario que ingrese su código de acceso.
        •	Los códigos válidos son del 1000 al 1999 (empleados) y del 2000 al 2999 (visitantes).
        •	Si el código es incorrecto 3 veces seguidas, bloquear el acceso.
        •	Si es un empleado, mostrar un mensaje personalizado con su ID.
        •	Si es un visitante, registrar su nombre y motivo de visita antes de ingresar.
    */



    val scanner = Scanner(System.`in`)
    var intentosfallidos = 0
    val intentosposibles = 3
    var bloquearusuario = false
    var intentosRealizados =0

    do {
        println(
            """
            --- Sistema de Control de Acceso ---
            1. Eres Empleado
            2. Eres Visitante
            3. Salir
       
            """.trimIndent()
        )

        print("Seleccionar opción: ")
        var opc = scanner.nextInt()

        when (opc) {
            1 ->
            {       for (i in 1..2) {
                    println("Ingresa tu código de empleado:")
                    val codigoEmpleado = scanner.nextInt()

                    if (codigoEmpleado in 1000..1999) {
                        println("El código del empleado es: ${codigoEmpleado} ¡Bienvenido}!")
                        intentosfallidos = 0
                        break
                    } else {
                        intentosfallidos++
                        intentosRealizados++
                        println("Código incorrecto. Intentos restantes: ${2 - intentosRealizados}")

                        if (intentosfallidos >= intentosposibles) {
                            bloquearusuario = true
                            println("Acceso bloqueado!.")
                            break
                        }
                    }
                }

                if (intentosRealizados == 2) {
                    println("Has agotado tus dos intentos, tu usuario a sido bloqueado, contactese con el administrador")

                }
            }
            2 -> {
                if (bloquearusuario) {
                    println("Acceso bloqueado por demasiados intentos fallidos.")
                    continue
                }

                println("Ingrese su código de visitante:")
                val codigoVisitante = scanner.nextInt()

                if (codigoVisitante in 2000..2999) {
                    scanner.nextLine()

                    print("Ingrese su nombre: ")
                    val nombreVisitante = scanner.nextLine()

                    print("Motivo de la visita: ")
                    val motivoVisita = scanner.nextLine()

                    println("Registro exitoso. Bienvenido, ${nombreVisitante} tu visita se da por:  ${motivoVisita} ")

                } else {
                    intentosfallidos++
                    println("Código incorrecto. Intentos restantes: ${intentosposibles - intentosfallidos}")

                    if (intentosfallidos >= intentosposibles) {
                        bloquearusuario = true
                        println("Acceso bloqueado. Demasiados intentos fallidos.")
                    }
                }
            }

            3 -> {
                println("Saliendo del sistema...")
                break
            }

            else -> {
                println("Opción no válida. Intente de nuevo.")
            }
        }
    } while (true)
}
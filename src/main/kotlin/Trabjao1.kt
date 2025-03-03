package org.example
import java.util.*
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    /*
Desarrollar un software que permita escoger el representante del municipio “Premier”. Para tal cargo se han postulado tres candidatos, los cuales han realizado una intensa campaña publicitaria utilizando los principales medios de comunicación (Internet, radio, y televisión). Se desea conocer el costo de la campaña calculando el retorno de la inversión realizada en publicidad. Para esto, se determinaron los siguientes valores dependiendo del medio que influenció al votante:


•	Voto influenciado por publicidad en Internet: $700000
•	Voto influenciado por publicidad en radio: $200000
•	Voto influenciado por publicidad en televisión: $600000

Lo anterior quiere decir que, por cada voto que reciba un candidato influenciado por publicidad en Internet, su costo de campaña se incrementara en $700000, del mismo modo por cada voto influenciado por publicidad en radio, su costo de campaña se incrementara en $200000, y finalmente, por cada voto influenciado por publicidad en televisión, su costo de campaña se incrementar en $600000.

Las elecciones para representante del municipio “Premier” requieren una aplicación que les permita:
1.	Votar por el candidato de su elección.
2.	Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.
3.	Vaciar todas las urnas de la votación.
4.	Conocer el número total de votos.
5.	Porcentaje de votos obtenidos por cada candidato.
6.	Costo promedio de campaña en las elecciones.
    */



    val scanner = Scanner(System.`in`)

    var canduCarlosInternet = 0
    var canduCarlosRadio = 0
    var canduCarlosTelevision = 0

    var canEduaInternet = 0
    var canEduaRadio = 0
    var canEduaTelevision = 0

    var CanCamInternet = 0
    var CanCamRadio = 0
    var CanCamTelevision = 0

    var internet=700000
    var radio=200000
    var television=600000
    var totalvotoscandidato = 0
    var costocar = 0
    var costoedu = 0
    var costocami = 0

    var opcion: String
    do {
        println(
            """
            MUNICIPIO PREMIER 
            
            COSTOS DE LA INFLUENCIA POR PUBLICIDAD
            * Voto influenciado por publicidad en Internet: $700000
            * Voto influenciado por publicidad en Radio: $200000
            * Voto influenciado por publicidad en televisión: $600000
            
            1. Votar por el candidato de su elección.
            2. Calcular el costo de campaña de un candidato.
            3. Vaciar todas las urnas de la votación.
            4. Conocer el número total de votos.
            5. Porcentaje de votos obtenidos por cada candidato.
            6. Costo promedio de campaña en las elecciones.
            0. Salir
            """.trimIndent()
        )
        print("Seleccione una opción: ")
        opcion = scanner.next()

        when (opcion) {
            "1" -> {
                println(
                    """
            --- VOTAR POR TU CANDIDATO -----
            
            CANDIDATOS:
            1. Carlos Eduardo
            2. Eduardo Manrique
            3. Camilo Valenciana
            
            PUBLICIDAD 
            1. Internet
            2. Radio
            3. Televisión
             
            """.trimIndent())
                print("Seleccione el número del candidato: ")
                val numCandidato = scanner.next()
                print("Seleccione Publicidad : ")
                val publicidad = scanner.next()

                when (numCandidato) {
                    "1" -> {
                        when (publicidad) {
                            "1" -> {
                                canduCarlosInternet++
                                println("Voto por Carlos Eduardo  publicidad internet")
                            }
                            "2" -> {
                                canduCarlosRadio++
                                println("Voto por Carlos Eduardo  publicidad radio")
                            }
                            "3" -> {
                                canduCarlosTelevision++
                                println("Voto por Carlos Eduardo publicidad television")
                            }
                            else -> {
                                println("No  es valida esta opcion!")
                            }
                        }
                    }
                    "2" -> {
                        when (publicidad) {
                            "1" -> {
                                canEduaInternet++
                                println("Voto por Eduardo Manrique publicidad internet).")
                            }
                            "2" -> {
                                canEduaRadio++
                                println("Voto por Eduardo Manrique publicidad radio.")
                            }
                            "3" -> {
                                canEduaTelevision++
                                println("Voto por Eduardo Manrique publicidad television")
                            }
                            else -> println("No  es valida esta opcion!")
                        }
                    }
                    "3" -> {
                        when (publicidad) {
                            "1" -> {
                                CanCamInternet++
                                println("Voto por Camilo Valenciana publicidad internet")
                            }
                            "2" -> {
                                CanCamRadio++
                                println("Voto por Camilo Valenciana publicidad radio")
                            }
                            "3" -> {
                                CanCamTelevision++
                                println("Voto por Camilo Valenciana publicidad television")
                            }
                            else -> println("No  es valida esta opcion!")
                        }
                    }
                    else -> println("No  es valida esta opcion!")
                }
            }

            "2" -> {

                println(
                    """
            --- COSTOS  -----
            
            CANDIDATOS:
            1. Carlos Eduardo
            2. Eduardo Manrique
            3. Camilo Valenciana
           
            Seleccione el número del candidato: 
            """.trimIndent())

                val numCandidato = scanner.next()
                when (numCandidato) {
                    "1" -> {
                        costocar = canduCarlosInternet * internet + canduCarlosRadio * radio + canduCarlosTelevision * television
                        println("Costo de campaña de Carlos Eduardo: ${costocar}")
                    }
                    "2" -> {
                        costoedu= canEduaInternet * internet + canEduaRadio * radio + canEduaTelevision * television
                        println("Costo de campaña de Eduardo Manrique: ${costoedu}")
                    }
                    "3" -> {
                        costocami = CanCamInternet * internet + CanCamRadio * radio + CanCamTelevision * television
                        println("Costo de campaña de Camilo Valenciana: ${costocami}")
                    }
                    else -> println("Candidato no válido.")
                }
            }

            "3" -> {
                println("--- Vaciar urnas ---")
                canduCarlosInternet = 0
                canduCarlosRadio = 0
                canduCarlosTelevision = 0
                canEduaInternet = 0
                canEduaRadio = 0
                canEduaTelevision = 0
                CanCamInternet = 0
                CanCamRadio = 0
                CanCamTelevision = 0
                println("Vaciado correcto.")
            }

            "4" -> {
                println("-- Número total de votos ---")
                totalvotoscandidato = canduCarlosInternet + canduCarlosRadio + canduCarlosTelevision +
                        canEduaInternet + canEduaRadio + canEduaTelevision +
                        CanCamInternet + CanCamRadio + CanCamTelevision
                println("El total de votos de todos los candidatos es: ${totalvotoscandidato}")
            }

            "5" -> {
                println("--- Porcentaje de votos por candidato ---")

                if (totalvotoscandidato > 0) {
                    val porcentajeCar = (canduCarlosInternet + canduCarlosRadio + canduCarlosTelevision).toDouble() / totalvotoscandidato * 100
                    val porcentajeEdua = (canEduaInternet + canEduaRadio + canEduaTelevision).toDouble() / totalvotoscandidato * 100
                    val porcentajeCami = (CanCamInternet + CanCamRadio + CanCamTelevision).toDouble() / totalvotoscandidato * 100
                    println("Carlos Eduardo: ${"porcentaje %.0f".format(porcentajeCar)} %")
                    println("Eduardo Manrique: ${"porcentaje %.0f".format(porcentajeEdua)} %")
                    println("Camilo Valenciana: ${"porcentaje %.0f".format(porcentajeCami)} %")
                } else {
                    println("No hay votos registrados.")
                }
            }

            "6" -> {
                println("-- Costo promedio de campaña ---")

                val promedio = (costocar + costoedu + costocami) / 3.0
                println("Costo promedio de campaña: ${"%.2f".format(promedio)}")
            }

            "0" -> println("Saliendo del programa...")
            else -> println("Opción no válida. Intente de nuevo.")
        }
    } while (opcion != "0")
}




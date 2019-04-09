////Function/////////////////////////////////////////////////////////////////////

fun readValue( numbersToCheck:IntArray){// wczytuje liczby do sprawdzenia
    for (i in 0..(numbersToCheck.size-1)){
       numbersToCheck[i] =  readLine().toString().toInt()
    }
}

fun silnia(data:Int):Int{//oblicza silnie
    var wynik:Int = 1
    for (i in 1..data){
        wynik = wynik * i
        //println(wynik)
    }
    return wynik
}

fun printTwoNumbers(number :String){//wyświetla liczbe dziesiątek spacja liczbe jedności
    for (i in 0..number.length){
        if (i == number.length-2)print(number[i])
        if (i == number.length-1)print(" "+number[i])
    }
}

fun writeScore(numbersToWrite: IntArray){
    for (i in 0..(numbersToWrite.size-1)){
        //println(silnia(numbersToWrite[i]))
        //var numberStr :String = silnia(numbersToWrite[i]).toString()
        //println(printTwoNumbers(silnia(numbersToWrite[i]).toString()))
        println(printTwoNumbers(silnia(numbersToWrite[i]).toString()))
        println((silnia(numbersToWrite[i]).toString()))
    }
}

/////////////////////////////////////////////////////////////////////////////////
fun main(args:Array<String>) {
    //Variables/////////////////////////////////////////////
    val howMutchTest = readLine().toString().toInt()
    var arrayOfNumbers = IntArray(howMutchTest)
    ////////////////////////////////////////////////////////
    readValue(arrayOfNumbers)
    writeScore(arrayOfNumbers)
    //printTwoNumbers(howMutchTest.toString())
}
////Function/////////////////////////////////////////////////////////////////////

fun readValue( numbersToCheck:IntArray){// wczytuje liczby do sprawdzenia
    for (i in 0..(numbersToCheck.size-1)){
       numbersToCheck[i] =  readLine().toString().toInt()
    }
}

fun silnia(data:Int):String{//oblicza silnie
    var wynik:Int = 1
    for (i in 1..data){
        wynik = wynik * i
    }
    return wynik.toString()
}

fun printTwoNumbers(number :String):String{//wyświetla liczbe dziesiątek spacja liczbe jedności
    var wynik: String = "0"
    for (i in 0..number.length){
        if (i == number.length-2)wynik = number[i].toString()
        if (i == number.length-1) wynik = wynik + " " + number[i].toString()
    }
    return wynik
}

fun writeScore(numbersToWrite: IntArray){//wypisuje wyniki
    for (i in 0..(numbersToWrite.size-1)){
        println(printTwoNumbers(silnia(numbersToWrite[i])))
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
}
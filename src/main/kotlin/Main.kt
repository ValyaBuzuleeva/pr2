fun main(args: Array<String>) {

//1.
    val age1: Int = 42 // создание константы
    val age2: Int = 21
    println(age1)
    println(age2)
    // тип данных 2-х констант- Int
//2.
    val avg1: Int = (age1 + age2) / 2
    println(avg1)
// при получении ответа не отображает остаток
//3.
    // потому что использовался тип Int, который не выдавал остаток.
//4.
    val firstName: String = "ВАЛЯ"
    val lastName: String = "БУЗУЛЕЕВА"
    //
//5.
    val fullName: String = firstName + " " + lastName
    println(fullName)
    //Создали строковую константу. Которая вывела мое имя и фамилию
//6.
    val myDetails: String = fullName
    println("Привет, меня зовут " + firstName)

    //
//7.
    val triple = Triple (4, 15,2005)

//
//8.
    val month = triple.first
    val day = triple.second
    val year = triple.third
    println(triple)
}
//
//9.

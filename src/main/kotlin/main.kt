const val LUDIAM = "людям"
const val CHELOVEKU = "человеку"
const val CHELOVEKAM = "человекам"

val words = arrayOf(
    LUDIAM,     //0
    CHELOVEKU,  //1
    LUDIAM,     //2
    CHELOVEKAM, //3
    CHELOVEKAM, //4
    CHELOVEKAM, //5
    CHELOVEKAM, //6
    CHELOVEKAM, //7
    CHELOVEKAM, //8
    CHELOVEKAM, //9
)

fun main() {
    print("Количество лайков: ")

    val countStr = readln().toString();

    if (countStr.toIntOrNull() == null) {
        print("Неверный ввод")
        return
    }

    val countInt = countStr.toInt()
    val lastDigit = countStr[countStr.count() - 1].digitToInt()
    val manWord = words[lastDigit]

    print("Понравилось $countInt $manWord")
}
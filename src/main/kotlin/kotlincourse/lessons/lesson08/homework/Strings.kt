package kotlincourse.lessons.lesson08.homework

// 1. String conversion
fun main() {
    fun example1(phrase: String) {
        val result = when {
            phrase.contains("невозможно", ignoreCase = true) ->
                phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")

            phrase.contains("Я не уверен", ignoreCase = true) -> "$phrase, но моя интуиция говорит об обратном"

            phrase.contains("катастрофа", ignoreCase = true) ->
                phrase.replace("катастрофа", "интересное событие")

            phrase.contains("без проблем", ignoreCase = true) ->
                phrase.replace("без проблем", "с парой интересных вызовов на пути")

            !phrase.contains(" ") -> "Иногда, ${phrase}, но не всегда"

            else -> phrase

        }
        println(result)
    }
    example1("без")

    // Data extraction
    fun example2(log: String) {
        val logIndex = log.indexOf("->")
        val logTime = log.substring(logIndex + 3)
        val logTimeParts = logTime.split(" ")
        val date = logTimeParts[0]
        val time = logTimeParts[1]
        println(date)
        println(time)
    }
    example2("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    //Phone number mask
    fun example3(log: String) {
        val logNumber = log.substring(0, 13)
        val logRest = log.substring(14)
        val logMask = logNumber.replace(logNumber, "**** **** ****")
        println(logMask + logRest)

    }
    example3("4539 1488 0343 6467")

    // separation of email with replace
    fun example4(mail: String) {
        val mailReplacements = mapOf(
            "@" to " at ",
            "." to " dot "
        )
        var mailReplaced = mail

        for ((symbol, word) in mailReplacements) {
            mailReplaced = mailReplaced.replace(symbol, word)
        }
        println(mailReplaced)
    }
    example4("username@example.com")

    //File extraction from path
    fun example5(file: String) {
        val fileName = file.substringAfterLast("/")
        println(fileName)
    }
    example5("D:/good.themes/dracula.theme")

    fun example6(short: String) {
        val shortSplit = short.split(" ")
        var shortResult = ""
        for (shortLetter in shortSplit) {
            shortResult += shortLetter[0].uppercase()
        }
        println(shortResult)
    }

    example6("Котлин лучший язык программирования")
}




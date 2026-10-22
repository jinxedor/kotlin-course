package kotlincourse.lessons.lesson13.homework

fun main() {
//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val test1 = mapOf("regisration" to 3.99, "refresh" to 2.5, "authorization" to 12.05)
    println(test1.values.average())

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    val test2 = mapOf(
        "testRegistration" to "priority=high; author=ivanov; tags=smoke,auth",
        "testRefreshToken" to "priority=medium; author=petrova; tags=auth,api",
        "testAuthorization" to "priority=high; author=ivanov; tags=smoke,security"
    )
    println(test2.keys)

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val test3 = mutableMapOf(
        "testRegistration" to "PASSED",
        "testRefreshToken" to "PASSED",
        "testAuthorization" to "FAILED",
        "testProfileUpdate" to "SKIPPED",
        "testLogout" to "PASSED"
    )
    test3["testTranzaction"] = "PASSED"
    println(test3.entries)

//Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    println("passed: ${test3.count { it.value == "PASSED" }}")

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val test4 = mutableMapOf(
        "BUG-101" to "open",
        "BUG-102" to "fixed",
        "BUG-103" to "in progress",
        "BUG-104" to "open",
        "BUG-105" to "fixed"
    )
    test4.remove("BUG-102")
    println(test4.keys)

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val test5 = mapOf(
        "https://example.com/" to 200,
        "https://example.com/login" to 200,
        "https://example.com/profile" to 403,
        "https://example.com/old-page" to 404,
        "https://example.com/api/report" to 500
    )
    println(test5.entries)

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    println(test1.all { it.value > 10 })

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val test6 = mapOf(
        "/api/login" to "200 OK",
        "/api/users" to "200 OK",
        "/api/orders" to "404 Not Found",
        "/api/payments" to "500 Internal Server Error",
        "/api/profile" to "403 Forbidden"
    )
    println(test6.getOrElse("/api/orders") { "untested" })

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация),
// получите значение для "browserType". Ответ не может быть null.
    val test7 = mapOf(
        "browserType" to "chrome",
        "baseUrl" to "https://staging.example.com",
        "timeoutSeconds" to "30",
        "headless" to "true",
        "language" to "en"
    )
    println(test7.getOrDefault("browserType", "Unidentified"))

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val test8 = mapOf(
        "web-client" to "2.4.1",
        "mobile-app" to "1.9.0",
        "api-gateway" to "3.2.5",
        "auth-service" to "1.3.2"
    )
    println(test8 + ("payment-service" to "2.5.0"))

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками),
// получите настройки для конкретной модели или верните настройки по умолчанию.
    val test9 = mapOf(
        "Pixel 8" to "android=14; resolution=1080x2400; orientation=portrait",
        "Galaxy S23" to "android=13; resolution=1080x2340; orientation=portrait",
        "iPhone 15" to "ios=17; resolution=1179x2556; orientation=portrait",
        "iPad Air" to "ios=17; resolution=1640x2360; orientation=landscape"
    )
    println(test9.getOrElse("Pixel 8") { "default settings" })

//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val test10 = mapOf(
        "E101" to "Element not found",
        "E102" to "Timeout while waiting for response",
        "E201" to "Assertion failed: expected 200, got 500",
        "E301" to "Invalid test data format"
    )
    println(test10.containsKey("E102"))

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов,
// то-есть в ключе содержится требуемая версия.
    val test11 = mapOf(
        "Login_v1" to "Passed",
        "Login_v2" to "Failed",
        "Registration_v1" to "Passed",
        "Registration_v2" to "Skipped",
        "Logout_v1" to "Failed",
        "Search_v2" to "Passed"
    )
    println(test11.filterKeys { it.contains("v2") })

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
    val test12 = mapOf(
        "Authorization" to "Passed",
        "Registration" to "Passed",
        "Payment" to "Failed",
        "Search" to "Passed",
        "Notifications" to "Skipped"
    )
    println(test12.filterValues { it == "Failed" })

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val test13 = mutableMapOf(
        "browser" to "chrome",
        "baseUrl" to "https://staging.example.com",
        "timeoutSeconds" to "30",
        "headless" to "false"
    )
    val test13Extra = mapOf(
        "language" to "en",
        "screenResolution" to "1920x1080",
        "timeoutSeconds" to "60",
        "retryCount" to "2"
    )
    test13.putAll(test13Extra)
    println(test13)

//Объедините два неизменяемых словаря с данными о багах.
    val test14 = mapOf(
        "BUG-101 Crash on login" to "open",
        "BUG-102 Wrong total in cart" to "fixed",
        "BUG-103 Typo on settings page" to "in progress"
    )

    val test14Extra = mapOf(
        "BUG-103 Typo on settings page" to "fixed",
        "BUG-104 Slow search results" to "open",
        "BUG-105 Logout button unresponsive" to "open"
    )
    println(test14 + test14Extra)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val test15 = mutableMapOf(
        "testRegistration" to 3.99,
        "testRefreshToken" to 2.5,
        "testAuthorization" to 12.05,
        "testProfileUpdate" to 5.2,
        "testLogout" to 1.3
    )
    println(test15.clear())

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”).
// Ключи - название теста, значения - статус.
    val test16 = mapOf(
        "testRegistration" to "passed",
        "testRefreshToken" to "skipped",
        "testAuthorization" to "failed",
        "testProfileUpdate" to "skipped",
        "testLogout" to "passed",
        "testSearch" to "passed"
    )
    println(test16.filterNot { it.value == "skipped" })

//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
//Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
//Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
//Проверьте, пуст ли словарь с ошибками компиляции тестов.
//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
}
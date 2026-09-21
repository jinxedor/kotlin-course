package kotlincourse.lessons.lesson03.homework

// Название мероприятия
val eventName: String = "Hakaton"

// Дата проведения
var date: String = "2016-08-08"

// Место проведения
val place: String = "Madrid"

// Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
private val indepth_budget: Int = 1000000

// Количество участников
var pertisipants: Int = 0

// Длительность хакатона
val duration: String = "1-3 days"

// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private val contract_information: String = "+79000000000"

// Текущее состояние хакатона (статус)
lateinit var status: String

// Список спонсоров
val sponsor: String = "Sponsor"

// Бюджет мероприятия
val budget: Int = 2000000

// Текущий уровень доступа к интернету
var connection_level: String = "Connection level"

// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var logistics_information: String = "Logistics"

// Количество команд
var teams: Int = 17

// Перечень задач
val task_list: String = "tasks"

// План эвакуации
var evacuation: String = "Evacuation"

// Список доступного оборудования (всё, что выделено для использования на мероприятии)
 var available_instruments: String = "Instruments"

// Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
lateinit var free_instruments: String

// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var eating_schedule: String

// План мероприятий на случай сбоев
private val contingency_plan: String = "Your contingency"

// Список экспертов и жюри
lateinit var jury_list: String

// Политика конфиденциальности
val confidentiality_policy: String = "Cofidentiality"

// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var feedback: String = "feedback"

// Текущая температура в помещении
var temperature: Double = 24.2

// Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
var debug_info: String = "Monitoring Info"

// Регулятор скорости интернета (понижающий коэффициент, например 0.5)
private var internet_speed: Double = 0.7

// Уровень освещения
var lighting_level: Double = 1.2

// Лог событий мероприятия
lateinit var event_log: String

// Возможность получения медицинской помощи прямо на мероприятии (да/нет)
var medical_help: Boolean = true

// Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
lateinit var securityMeasures: String

// Регистрационный номер мероприятия
val regNumber: Int = 242202023

// Максимально допустимый уровень шума в помещении хакатона.
val noiseMax: Double = 2.23

// Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
var noiseCurrent: Double = 2.55

// План взаимодействия с прессой
private val pressInteraction: String = "Press"

// Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
lateinit var projectInfo: String

// Статус получения всех необходимых разрешений для проведения мероприятия
var eventApproval: Boolean = true

// Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
var instrumentFree: Boolean = true

// Список партнеров мероприятия
var partnerList: String = "Partner"

// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var postEvent: String

// Внутренние правила распределения призов
private val awardRules: String = "Award Rules"

// Список разыгрываемых призов
val awardList: String = "Awards"

// Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val emergencyContacts: String = "Emergency Contacts"

// Особые условия для участников с ограниченными возможностями
val virtueSignaling: String = "VirtueSigning"

// Общее настроение участников (определяется опросами)
lateinit var contestantMood: String

// Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
lateinit var startingPlan: String

// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
lateinit var specialGuest: String

// Максимальное количество людей, которое может вместить место проведения.
val maxGuest: Int = 2000

// Количество часов, отведенное каждой команде для работы над проектом.
var projectTime: Int = 2000
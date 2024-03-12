# Дипломный проект

### Разработка программного обеспечения для импорта и математической обработки геоданных, полученных в результате тахеометрической съёмки с использованием различных типов электронных тахеометров.

Целью настоящего проекта является разработка удобного, надёжного инструмента с дружественным графическим интерфейсом для инженера-топографа, использующего для создания цифровой модели местности электронные тахеометры.

Электронные тахеометры это оптико-электронные приборы, которые позволяют производить линейно-угловые измерения на местности с высокой производительностью и точностью и сохранять необработанные данные в электронных накопителях. 

Проблема заключается в том, что на данный момент не существует единого формата данных и разные производители (Nicon, Leica, Topcon, Sokkia и др.) сохраняют сырые данные в своём внутреннем формате. 

Разрабатываемая данным проектом программа **Taheoport** (её минимально рабочая версия) импортирует данные из трёх типов тахеометров:

- Leica

- Topcon

- Nicon

**Taheoport** выполняет математическую обработку импортированных сырых данных и предоставляет результаты в виде каталогов координат и ведомостей, необходимых для отчётов о проделанной работе.

Проектом предусматривается использование следующих ресурсов:

- рабочая машина под управлением операционной системы **Ubuntu 20.04**

- разработка пояснительной записки к проекту в программе **LibreOffice Writer** 

- формат пояснительной записки Word 2007-365(.docx)

- система контроля версий **git**

- хранение файлов проекта публичный репозиторий на онлайн платформе **Github**

- хранение и контроль версий исходного кода программы [здесь](https://github.com/AndrewNizovkin/Taheoport)

- реализация клиент-серверной архитектуры программы средствами фрэймворка **Spring**

- реализация графического пользовательского интерфейса средствами библиотеки **javax.swing**

 - сериализация и сохранение средсвами библиотеки **jackson**

 - разработка Unit-тестов средствами библиотеки **Junit-5**

 - разработка интеграционных тестов средствами фрэймворка **Mockito**

Для проведения конечных, сквозных тестов программы проектом предусматривается использование данных из архива автора дипломного проекта имеющего опыт работы в предметной области с 1993г по 2022г.

Об авторе [здесь](https://github.com/AndrewNizovkin/job/blob/master/resume.md)



@ Copyright 2024 Nizovkin A.V.

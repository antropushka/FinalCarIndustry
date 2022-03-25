//Суть задания создать следующую структуру классов и методов:
//
//
//
//        2) Сервис.
//
//
//        * Добавит\Удалить опцию.
//
//        -------------------
//        Для каждой задачи необходим конкретный класс сервиса.
//        Например сервис для покраски, или сервис для замены колёс.
//        -------------------
//
//        3) Автозавод.
//
//        Имеет следующие особености:
//        * Имеет список моделей которые может создавать. Этот список должен задаваться
//        во время создания.
//        * Имеет список с обьемами двигателей которые можно установить на автомобиль.
//        Этот список должен задаваться во время создания.
//        * Имеет Список цветов в которые можно покрасить автомобиль. Этот список
//        должен задаваться во время создания.
//        * Имеет список размеров колес которые можно установить на автомобиль. Этот
//        список должен задаваться во время создания.
//        * Завод имеет склад, во время создания завода он производит некоторое кол-во
//        автомобилей и хранит их на складе.
//
//        Имеет следующие возможности:
//        * Ожжидается возможность вывода на печать возможных для производства
//        цветов/обьемов двигателей/моделей/размеров дисков
//        * Создать автомобиль по заказу салона. Однако если автомобиль есть на
//        складе он должен быть использован вместо создания нового.
//        * Ожидается возможность выбора со склада найболее подходяшего автомобиля
//        и изменения его согласно заказу.
//
//        -------------------
//        Общее колличество заводов на ваше усмотрение, минимум 3.
//        На заводе возможно производить только автомобили которые
//        допустимы на данном заводе(один подкласс класса Car).
//        -------------------
//
//        4) Автосалон.
//        Используется для заказа автомобиля на заводе, или изменения уже существующего авто на сервисе.
//
//        -------------------
//        Салон должен изменять автомобиль на необходимом сервисе.
//        Так же заказ автомобиля должен происходить с нужного завода.
//        -------------------
//
//
//        Дополнительный функционал приветствуется.

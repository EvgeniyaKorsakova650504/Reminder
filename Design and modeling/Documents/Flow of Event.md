## Поток событий для прецедента "Просмотреть созданные события"
### Главный поток
 - Вариант использоывания начинается, когда пользователь запускает приложение
 - Приложение выводит список всех созданных событий. Если событий нет, выполняется альтернативный поток A1.
 - Вариант использования завершается.
### Альтернативный поток A1
 - Поток начинается
 - Пользователю выводится сообщение, что у него нет событий.
 - Поток завершается.
## Поток событий для прецедента "Создать новое событие"
### Главный поток
 - Вариант использоывания начинается, когда пользователь нажимает на кнопку "+"
 - На экране отображается окно, в котором находятся поля для заполнения и кнопка "Create event"
 - Пользователь вводит название события. Если название не будет введено, то выполняется альтернативный поток E1
 - Пользователь вводит дату, когда событие должно произойти. Если дата не будет введена, то выполняется альтернативный поток E1
 - Пользователь вводит описание события.
 - Пользователь нажимает на кнопку "Create event". Если кнопка не будет нажата, то выполняется альтернативный поток A1
 - Созданное событие добавляется в список событий пользователя
 - Вариант использования завершается
### Альтернативный поток A1
 - Поток начинается 
 - Окно создания события закрывается
 - Поток завершается 
### Альтернативный поток E1
 - Поток начинается
 - Контур поля, в котором допущена ошибка, меняет свой цвет на красный
 - Поток завершается
## Поток событий для прецедента "Удалить событие"
### Главный поток
- Вариант использоывания начинается, когда пользователь выделяет событие
- Приложение отображает иконку "trash" с изображение мусорного бака
- Пользователь нажимает на иконку "trash". Если нажатие не произошло, то выполняется альтернативный поток A1
- Выбранное событие удаляется из списка событий пользователя
- Вариант использования завершается
### Альтернативный поток A1
 - Поток начинается 
 - С выбранного пользователем события снимается выделение
 - Поток завершается 
## Поток событий для прецедента "Редактировать созданное событие"
### Главный поток
- Вариант использоывания начинается, когда пользователь нажимает на событие
- Отображается окно с полями для ввода, заполненными текущими параметрами события, и кнопкой "Edit", которая изначально заблокирована
- Пользователь изменяет одно или несколько полей. Если изменения не были внесены, то выполняется альтернативный поток A1
- Кнопка "Edit" разблокируется
- Пользователь нажимает на кнопку "Edit". Если нажатие не происходит, то выполняется альтернативный поток E1
- К выбранному событию применяются изменения
- Вариант использования завершается
### Альтернативный поток A1
 - Поток начинается 
 - Кнопка "Edit" не разблокируется
 - Окно для редактирования закрывается
 - Поток завершается 
### Альтернативный поток E1
 - Поток начинается
 - К выбранному событию не применяются изменения
 - Окно для редактирования закрывается
 - Поток завершается

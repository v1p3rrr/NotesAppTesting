# NotesAppTesting
Первая практическая работа, состав подгруппы - Солдатов Илья, Едоженко Виталий, Немов Кирилл
Тестирование приложения для заметок Notes App: https://github.com/v1p3rrr/NotesAppTesting

Notes App - простое приложение для заметок. После входа в аккаунт пользователь может создавать текстовые заметки, которые сохранятся в общей облачной базе данных.

# Тестирование методом чёрного ящика

В процессе тестирования приложения были обнаружены следующие ошибки в программе:


+ При при быстром повторном нажатии на заголовок заметки в списке заметок из-за небольшой задержки перед переключением на экран редактирования заметки, этот экран может открыться дважды: ![демонстрация](https://i.imgur.com/jQ2oQmW.gif)

+ При попытке авторизации/регистрации с выключенным интернет-соединением приложение будет писать сообщение об ошибке "Неверные email/пароль", либо "Неверно введён email", даже если данные введены корректно: ![демонстрация](https://i.imgur.com/wiCeXjj.png)

+ При открытии приложения с выключенным интернет-соединением будучи авторизованным в системе, список заметок не загрузится, при этом никаких сообщений не выводится: ![демонстрация](https://i.imgur.com/wRyAhOd.png)

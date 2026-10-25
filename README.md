# TaskCalendar

Учебный Android-проект: приложение для управления задачами.  
Этап 1 — настройка окружения, структура проекта, основы Kotlin и жизненный цикл Activity.

## 📱 О проекте

Приложение отображает главный экран со статичным списком из трёх задач-заглушек.  
Данные прописаны прямо в коде и в ресурсах — базы данных на этом этапе нет.

- **Язык:** Kotlin
- **Минимальный SDK:** API 24
- **Тип проекта:** Empty Views Activity (классическая XML-разметка)
- **Пакет:** `ru.tksu.taskcalendar`

## 🛠️ Используемые технологии

- Android Studio
- Kotlin
- XML-разметка (`ConstraintLayout`)
- Gradle (Kotlin DSL)
- Git / GitHub

## 📂 Структура проекта

```text
app/
├── src/main/
│   ├── java/ru/tksu/taskcalendar/
│   │   └── MainActivity.kt          # Главный экран, жизненный цикл Activity
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # Разметка главного экрана
│   │   ├── values/
│   │   │   ├── strings.xml          # Все строки интерфейса
│   │   │   ├── colors.xml           # Цвета
│   │   │   └── themes.xml           # Тема приложения
│   │   ├── drawable/                # Изображения и shape-ресурсы
│   │   └── mipmap/                  # Иконки приложения
│   └── AndroidManifest.xml          # Манифест приложения
└── build.gradle.kts                 # Файл сборки модуля
```

## ✅ Что реализовано на этапе 1

- ☑ Настроено окружение: Android Studio, SDK, эмулятор (AVD).
- ☑ Создан проект «Empty Views Activity» на Kotlin с пакетом ru.university.taskcalendar.
- ☑ Изучена структура Android-проекта.
- ☑ Реализован главный экран со статичным списком из 3 задач-заглушек на ConstraintLayout.
- ☑ Все тексты вынесены в strings.xml.
- ☑ В MainActivity.kt переопределены все 6 методов жизненного цикла с логированием в Logcat.
- ☑ Изучены val / var и Null Safety в Kotlin.

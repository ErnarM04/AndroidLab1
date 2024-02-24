package com.example.lab1.model

import com.example.lab1.R

object PizzaDataSource {
    val pizzaList: ArrayList<ParentPizza> = arrayListOf(
        Pizza(
            name = "Вау! Кебаб",
            shortdescription = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            price = 2900,
            imageRes = R.drawable.wowkebab
        ),
        Pizza(
            name = "Пепперони с грибами",
            shortdescription = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            price = 2000,
            imageRes = R.drawable.withmushrooms
        ),
        Pizza(
            name = "Ветчина и огурчики",
            shortdescription = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            price = 2000,
            imageRes = R.drawable.hampickes
        ),
        NewPizza(
            name = "Комбо от смешариков",
            shortdescription = "Одобрено героями мультфильма: маленькая пицца любого вкуса и набор юного садовода. Цена комбо зависит от выбранных пицц и может быть увеличена",
            price = 2300,
            imageRes = R.drawable.combo1
        ),
        Pizza(
            name = "Сырная",
            shortdescription = "Моцарелла, сыры чеддер и пармезан, соус альфредо",
            price = 1900,
            imageRes = R.drawable.cheesy
        ),
        Pizza(
            name = "Пепперони фреш",
            shortdescription = "Пикантная пепперони, мно-о-ого моцареллы, томаты и томатный соус",
            price = 1900,
            imageRes = R.drawable.pepperonifresh
        ),
        Pizza(
            name = "Двойной цыпленок",
            shortdescription = "Цыпленок, моцарелла, соус альфредо",
            price = 2900,
            imageRes = R.drawable.doublecincken
        ),
        NewPizza(
            name = "Баварская",
            shortdescription = "Острые колбаски чоризо, маринованные огурчики, красный лук, томаты, горчичный соус, моцарелла, фирменный томатный соус",
            price = 1600,
            imageRes = R.drawable.combo3
        ),
        Pizza(
            name = "Чоризо фреш",
            shortdescription = "Пикантные колбаски чоризо из цыпленка, зеленый перец, моцарелла, томатный соус",
            price = 1900,
            imageRes = R.drawable.chorizo
        ),
        Pizza(
            name = "Ветчина и сыр",
            shortdescription = "Ветчина, моцарелла и соус альфредо — просто и со вкусом",
            price = 1900,
            imageRes = R.drawable.hamcheese
        ),
        Pizza(
            name = "Карбонара",
            shortdescription = "Ветчина из цыпленка, сыры чеддер и пармезан, томаты, красный лучок, моцарелла, соус альфредо, чеснок и итальянские травы",
            price = 2400,
            imageRes = R.drawable.carbonara
        ),
        Pizza(
            name = "Сырный цыпленок",
            shortdescription = "Цыпленок, моцарелла, сыры чеддер и пармезан, сырный соус, томаты, соус альфредо, чеснок",
            price = 2900,
            imageRes = R.drawable.chessychicken
        ),

    )
}
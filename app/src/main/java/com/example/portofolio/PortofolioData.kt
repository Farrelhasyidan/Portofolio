package com.example.portofolio

object PortofolioData {
    private val title: Array<String> = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food App",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task Manager App",
        "Office Automation App"
    )

    private val poster: IntArray = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office

    )

    private  val link: Array<String> = arrayOf(
        "https://search.nuz.li/NmU5MmY5YTM4",
        "https://pin.it/3ttUNfs",
        "https://pin.it/77qUd27",
        "https://pin.it/2RdMJ7Y",
        "https://pin.it/2LhIjhx",
        "https://pin.it/B8Zq5fV",
        "https://pin.it/67UvToT",
        "https://pin.it/3tWyoXW",
        "https://pin.it/6xnCZEw",
        "https://pin.it/7pnOqvu",

    )

    val listAppAndroid: ArrayList<Portofolio>
        get() {
            val list: ArrayList<Portofolio> = arrayListOf<Portofolio>()
            for (position :Int in title.indices) {
                val android = Portofolio()
                android.title = title[position]
                android.image = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }

}
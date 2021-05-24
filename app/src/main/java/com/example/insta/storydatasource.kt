package com.example.insta

import model.story

class storydatasource{
    companion object{
        fun createDataSet(): ArrayList<story> {
            val list = ArrayList<story>()
            list.add(
                story(
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "_beach1"
                )
            )
            list.add(
                story(
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "_beach2"
                )
            )
            list.add(
                story(
                    "https://media.timeout.com/images/105488726/630/472/image.jpg",
                    "_beach3"
                )
            )

            list.add(
                story(

                    "https://media.timeout.com/images/105488726/630/472/image.jpg",
                    "_beach4"
                )
            )
            list.add(
                story(
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "_beach5"
                )
            )
            list.add(
                story(
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "_beach6"
                )
            )
            list.add(
                story(
                    "https://cdn.mos.cms.futurecdn.net/wtqqnkYDYi2ifsWZVW2MT4-1200-80.jpg",
                    "_beach7"
                )
            )
            list.add(
                story(
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "_beach8"
                )
            )
            list.add(
                story(
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "_beach1"

                )
            )
            list.add(
                story(
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "_beach1"

                )
            )
            list.add(
                story(
                    "https://cdn.mos.cms.futurecdn.net/wtqqnkYDYi2ifsWZVW2MT4-1200-80.jpg",
                    "_beach1"
                )
            )
            list.add(
                story(
                    "https://cdn.mos.cms.futurecdn.net/wtqqnkYDYi2ifsWZVW2MT4-1200-80.jpg",
                    "_beach1"
                )
            )

            return list
        }
    }
}
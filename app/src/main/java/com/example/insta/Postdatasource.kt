package com.example.insta

import model.Post
import model.story

class Postdatasource{
    companion object{
        fun createDataSet(): ArrayList<Post> {
            val list = ArrayList<Post>()
            list.add(
                Post(
                    "https://i.pinimg.com/236x/70/35/31/703531df9af6567a082ac93ca69c9899.jpg",
                    "Tony",
                    "https://i.pinimg.com/564x/e1/e3/e4/e1e3e4feb42166adee5486e5ea297e52.jpg",
                    "108,111 likes",
                    "Ironman",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/236x/d7/30/89/d730897fff71b63b7e1f220f2a42c79f.jpg",
                    "Thor",
                    "https://i.pinimg.com/originals/b2/41/52/b24152ce6b2951eb6c459078d4db815f.gif",
                    "Liked by Tony and 126 others",
                    "Thunder",

                )
            )

            list.add(
                Post(
                    "https://i.pinimg.com/236x/89/d4/17/89d4178a299b7fb3e1c3bedff51d5e66.jpg",
                    "Steve",
                    "https://i.pinimg.com/originals/11/b1/52/11b15291587e5f76bd3b38f3af22a798.gif",
                    "108,691 likes",
                    "Captain",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/564x/48/83/d8/4883d8faf804733a62a2365f0e7cd7ab.jpg",
                    "Nick",
                    "https://i.pinimg.com/564x/ac/f6/6e/acf66eafabff26986b7ff95991e02e6d.jpg",
                    "111 likes",
                    "Avengers",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/564x/3c/d5/ff/3cd5ff9d25da829335bfbc94d60f4d6f.jpg",
                    "Chandler",
                    "https://i.pinimg.com/564x/25/56/38/255638555fc958ec0d761b4c01f80353.jpg",
                    "108,111 likes",
                    "F.R.I.E.N.D.S",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/564x/35/a1/4d/35a14dafa868fcbf1d6d3f1a52820f40.jpg",
                    "Loki",
                    "https://i.pinimg.com/564x/a8/02/45/a80245b07d5cabc64da9f2c3e5f2bc53.jpg",
                    "108,111 likes",
                    "We have a Hulk",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/564x/da/59/4b/da594b2bdf5c92a6deccd8ff25a14884.jpg",
                    "Joey",
                    "https://i.pinimg.com/originals/e3/56/de/e356deeba608e05e43fa742429110bb9.gif",
                    "108,111 likes",
                    "roommates",

                )
            )
            list.add(
                Post(
                    "https://i.pinimg.com/564x/77/9c/a2/779ca22bc28557babaa482f4ed0de41f.jpg",
                    "Peter",
                    "https://i.pinimg.com/originals/ea/77/63/ea7763f1c9c7eb43cf37b4be6d0aa8e5.gif",
                    "108,111 likes",
                    "spiderverse",

                    )
            )
                return list
        }
    }
}
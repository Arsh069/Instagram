package com.example.insta

import model.Message


class Msgdatasource {
    companion object{
        fun createDataSet(): ArrayList<Message> {
            val list = ArrayList<Message>()
            list.add(
                Message(
                    "https://i.pinimg.com/564x/da/59/4b/da594b2bdf5c92a6deccd8ff25a14884.jpg",
                    "Joey",
                    "Shared a post"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/35/a1/4d/35a14dafa868fcbf1d6d3f1a52820f40.jpg",
                    "Loki",
                    "Seen 2h ago"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/3c/d5/ff/3cd5ff9d25da829335bfbc94d60f4d6f.jpg",
                    "Chandler",
                    "Sent 11h ago"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/48/83/d8/4883d8faf804733a62a2365f0e7cd7ab.jpg",
                    "Nick",
                    "Liked a message"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/da/59/4b/da594b2bdf5c92a6deccd8ff25a14884.jpg",
                    "Joey",
                    "Shared a post"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/236x/89/d4/17/89d4178a299b7fb3e1c3bedff51d5e66.jpg",
                    "Steve",
                    "Seen 11h ago"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/236x/d7/30/89/d730897fff71b63b7e1f220f2a42c79f.jpg",
                    "Thor",
                    "Liked a message"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/77/9c/a2/779ca22bc28557babaa482f4ed0de41f.jpg",
                    "Peter",
                    "Shared a post"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/67/f4/f1/67f4f19455734561b0766fdd4b6fe835.jpg",
                    "Wanda",
                    "Likes you"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/8d/ce/8d/8dce8d8d19fee341b9b53784d3a2ae2f.jpg",
                    "Strange",
                    "Mentioned you in a story"
                )
            )
            list.add(
                Message(
                    "https://i.pinimg.com/564x/00/94/fc/0094fc10459b35c73a2b30ef7c119f9f.jpg",
                    "Pool",
                    "sent a story"
                )
            )


            return list
    }
    }
}
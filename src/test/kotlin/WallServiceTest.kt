//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Assertions.assertTrue
//import org.junit.jupiter.api.Test
//
//class WallServiceTest {
//
//    @Test
//    fun add() {
//        val service = WallService()
//        val original = Post(
//            2,
//            1,
//            1,
//            1,
//            1,
//            "Тест",
//            1,
//            1,
//            false,
//            1,
//            1,
//            1,
//            100,
//            1000,
//            "Тест текст",
//            1,
//            canPin = false,
//            canDelete = false,
//            canEdit = false,
//            isPinned = false,
//            markedAsAd = false,
//            isFavourite = false,
//            donut = 1,
//            postponedId = 1
//        )
//
//        service.add(original)
//        assertEquals(original.id, 1)
//    }
//
//    @Test
//    fun update() {
//        val service = WallService()
//        service.add(Post(
//            1,
//            1,
//            1,
//            1,
//            1,
//            "Тест",
//            1,
//            1,
//            false,
//            1,
//            1,
//            1,
//            100,
//            1000,
//            "Тест текст",
//            1,
//            canPin = false,
//            canDelete = false,
//            canEdit = false,
//            isPinned = false,
//            markedAsAd = false,
//            isFavourite = false,
//            donut = 1,
//            postponedId = 1
//        ))
//
//        service.add(Post(
//            2,
//            1,
//            1,
//            1,
//            1,
//            "Тестfdfsdfgsdf",
//            1,
//            1,
//            false,
//            1,
//            1,
//            1,
//            100,
//            1000,
//            "Тест текст",
//            1,
//            canPin = false,
//            canDelete = false,
//            canEdit = false,
//            isPinned = false,
//            markedAsAd = false,
//            isFavourite = false,
//            donut = 1,
//            postponedId = 1
//        ))
//
//        service.add(Post(
//            3,
//            1,
//            1,
//            1,
//            1,
//            "Тестgdfhdfgsdfgsd",
//            1,
//            1,
//            false,
//            1,
//            1,
//            1,
//            100,
//            1000,
//            "Тест текст",
//            1,
//            canPin = false,
//            canDelete = false,
//            canEdit = false,
//            isPinned = false,
//            markedAsAd = false,
//            isFavourite = false,
//            donut = 1,
//            postponedId = 1
//        ))
//
//        val newPost = Post(1,
//            1,
//            1,
//            1,
//            1,
//            "Тест тест тест тест",
//            1,
//            1,
//            false,
//            1,
//            1,
//            1,
//            100,
//            1000,
//            "Тест текст",
//            1,
//            canPin = false,
//            canDelete = false,
//            canEdit = false,
//            isPinned = false,
//            markedAsAd = false,
//            isFavourite = false,
//            donut = 1,
//            postponedId = 1)
//
//        val result = service.update(newPost)
//        assertTrue(result)
//    }
//}
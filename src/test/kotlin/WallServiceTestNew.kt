import org.junit.Assert.*
import org.junit.Test

class WallServiceTestNew {

    @Test
    fun add() {
        val service = WallService()
        val original = Post(
            200,
            2,
            1,
            1,
            1,
            "Тест",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        )

        val expected = original.copy(id=1)

        service.add(original)
        assertEquals(expected, service.posts.last())
    }

    @Test
    fun update() {
        val service = WallService()
        service.add(Post(
            1,
            1,
            1,
            1,
            1,
            "Тест",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        service.add(Post(
            2,
            1,
            1,
            1,
            1,
            "Тестfdfsdfgsdf",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        service.add(Post(
            3,
            1,
            1,
            1,
            1,
            "Тестgdfhdfgsdfgsd",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        val newPost = Post(2,
            1234,
            1234,
            1234,
            1,
            "Тест тест тест тест",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1)

        val result = service.update(newPost)
        assertTrue(result)
    }

    @Test
    fun failedUpdate() {
        val service = WallService()
        service.add(Post(
            1,
            1,
            1,
            1,
            1,
            "Тест",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        service.add(Post(
            2,
            1,
            1,
            1,
            1,
            "Тестfdfsdfgsdf",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        service.add(Post(
            3,
            1,
            1,
            1,
            1,
            "Тестgdfhdfgsdfgsd",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1
        ))

        val newPost = Post(20,
            1234,
            1234,
            1234,
            1,
            "Тест тест тест тест",
            1,
            1,
            false,
            1,
            1,
            1,
            100,
            1000,
            "Тест текст",
            1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAd = false,
            isFavourite = false,
            donut = 1,
            postponedId = 1)

        val result = service.update(newPost)
        assertFalse(result)
    }
}
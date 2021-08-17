import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val original = Post(
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
        )

        val result = WallService.add(original)
        assertEquals(original, result)
    }
}
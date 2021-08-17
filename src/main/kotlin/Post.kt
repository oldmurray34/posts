data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendOnly: Boolean = true,
    val comments: Any,
    val copyright: Any,
    val likes: Int = 0,
    val reposts: Int = 0,
    val views: Int = 0,
    val postType: String = "post",
    val signerId: Int,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAd: Boolean = false,
    val isFavourite: Boolean = false,
    val donut: Any,
    val postponedId: Int
    )





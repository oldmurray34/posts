import attachment.Attachment

data class Comment (
    val id: Int,
    val postId: Int,
    val from_id: Int,
    val date: Int,
    val text: String,
    val donut: Any,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Attachment?,
    val parentStack: Any
        )
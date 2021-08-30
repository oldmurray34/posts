class PostNotFoundException(message: String): RuntimeException(message)

class WallService {
    var posts = emptyArray<Post>()

    var postId = 1

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (comment.postId == postInArray.id) {
                val newComments = postInArray.comments + comment
                posts[index] = postInArray.copy(comments = newComments)
                return true
            }
        }
        throw PostNotFoundException("No post with id ${comment.postId}")
    }
}
object WallService {
    var posts = emptyArray<Post>()

    private var postId = 0

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var result = true
        for (savedPost in posts) {
            if (post.id == savedPost.id) {
                posts[posts.indexOf(savedPost)] = savedPost.copy(
                    ownerId = post.ownerId,
                    text = post.text,
                    friendOnly = post.friendOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAd = post.markedAsAd,
                    isFavourite = post.isFavourite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
            } else {
                result = false
            }
        }
        return result
    }
}
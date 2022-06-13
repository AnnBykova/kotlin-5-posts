

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var counterId: Int = 0

    fun add(post: Post): Post {
        val postWithId = post.copy(id = setId())
        posts += postWithId
        return posts.last()
    }

    fun postUpdate(postUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postUpdate.id) {
                posts[index] = postUpdate.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

    fun setId(): Int {
        counterId += 1
        return counterId
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index, post) in posts.withIndex()) {
            if (findPostById(postId)) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException ("Пост с id = $postId не найден")
    }

    fun findPostById(postId: Int): Boolean {
        for (post in posts) {
            if (post.id == postId) {
                return true
            }
        }
        return false
}

}
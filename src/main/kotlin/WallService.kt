

class WallService {
    private var posts = emptyArray<Post>()
    private var counterId : Long = 0

    fun add(post: Post): Post {
        val postWithId = post.copy(id = setId())
        posts += postWithId
        return posts.last()
    }

    fun postUpdate(postUpdate: Post) : Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postUpdate.id) {
                posts[index]= postUpdate.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

    fun setId () : Long {
        counterId += 1
        return counterId
    }


}
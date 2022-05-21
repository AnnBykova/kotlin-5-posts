import org.junit.Test

import org.junit.Assert.*

class WallServicektTest {

    @Test
    fun add() {
        val serviceAdd = WallService ()
        val newPost = Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = "2022-05-10",
            text = "текст",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )
        val expectedId: Long = 1
        val post: Post = serviceAdd.add(newPost)
        assertEquals(expectedId,post.id)

    }

    @Test
    fun postUpdateSuccessful() {
        val serviceUpdate = WallService ()
        val newPost = Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = "2022-05-10",
            text = "текст",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )
        val newPost2 = Post(
            id = 0,
            ownerId = 1,
            fromId = 1, createdBy = 1,
            date = "2022-05-11",
            text = "текст2",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )
        val newPost3 = Post(
            id = 2,
            ownerId = 1,
            fromId = 1, createdBy = 1,
            date = "2022-05-11",
            text = "новый текст",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )

        serviceUpdate.add(newPost)
        serviceUpdate.add(newPost2)
        val result : Boolean = serviceUpdate.postUpdate(newPost3)
        assertTrue(result)
    }

    @Test
    fun postUpdateFailed() {
        val serviceUpdate = WallService ()
        val newPost = Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = "2022-05-10",
            text = "текст",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )
        val newPost2 = Post(
            id = 0,
            ownerId = 1,
            fromId = 1, createdBy = 1,
            date = "2022-05-11",
            text = "текст2",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )
        val newPost3 = Post(
            id = 2,
            ownerId = 1,
            fromId = 1, createdBy = 1,
            date = "2022-05-11",
            text = "новый текст",
            replyOwnerId = 1,
            replyPostId = 0,
            friendsOnly = false,
            postType = "new",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            comments = Comment(0,false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,"")
        )

        serviceUpdate.add(newPost)
        serviceUpdate.add(newPost2)
        val result : Boolean = serviceUpdate.postUpdate(newPost3)
        assertFalse(result)
    }
}
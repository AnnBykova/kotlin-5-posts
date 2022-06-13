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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        val expectedId: Int = 1
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0,"", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0,"", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        val newPost3 = Post(
            id = 15,
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )

        serviceUpdate.add(newPost)
        serviceUpdate.add(newPost2)
        val result : Boolean = serviceUpdate.postUpdate(newPost3)
        assertFalse(result)
    }

    @Test
    fun findPostByIdSuccessful (){
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        val expectedResult: Boolean = true
        val post: Post = serviceAdd.add(newPost)
        val result : Boolean = serviceAdd.findPostById (1)
        assertEquals(expectedResult,result)

    }

    @Test
    fun findPostByIdFailed (){
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        val expectedResult: Boolean = false
        val post: Post = serviceAdd.add(newPost)
        val result : Boolean = serviceAdd.findPostById (13)
        assertEquals(expectedResult,result)

    }

    @Test
    fun createCommentCommentAddedSuccessful () {
        val service = WallService ()
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
            comments = Comment(0,"", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        service.add(newPost)
        service.add(newPost2)
        val comment = Comment(1,"comment", true,true,true, true)
        val expectedResult = Comment(1,"comment", true,true,true, true)
        assertEquals(expectedResult, service.createComment(2, comment))


    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentShouldThrow() {
        val service = WallService ()
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
            comments = Comment(0,"", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
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
            comments = Comment(0, "", false,false,false,false),
            copyright = Copyright(12, "", "name", "type"),
            likes = Likes(0, true, true, true),
            reposts = Reposts(0,true),
            views = Views(0),
            donut = Donut(true, 1, true, true,""),
            attachments = emptyArray<Attachment>()
        )
        service.add(newPost)
        service.add(newPost2)
        val comment = Comment(1,"comment", true,true,true, true)
        val expectedResult = Comment(1,"comment", true,true,true, true)
        service.createComment(21, comment)
    }
}
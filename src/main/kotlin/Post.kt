import java.util.Date

data class Post (
    val id : Long = 0,
    val ownerId : Long,
    val fromId : Long,
    val createdBy : Long?,
    val date : String,
    val text : String,
    val replyOwnerId : Long?,
    val replyPostId : Long?,
    val friendsOnly : Boolean,
    val comments : Comment?,
    val copyright : Copyright?,
    val likes : Likes?,
    val reposts : Reposts?,
    val views : Views?,
    val postType : String,
    val signerId : Long?,
    val canPin : Boolean,
    val canDelete : Boolean,
    val canEdit : Boolean,
    val isPinned : Boolean,
    val markedAsAds : Boolean,
    val isFavorite : Boolean,
    val donut : Donut?,
    val postponedId : Long?,
    val attachments: Array <Attachment>
        )

data class Comment (
    val count : Int,
    val canPost : Boolean,
    val groupsCanPost : Boolean,
    val canClose : Boolean,
    val canOpen : Boolean
        )

data class Copyright (
    val id : Int,
    val link : String,
    val name : String,
    val type : String,
   )

data class Likes (
    val count : Int,
    val userLikes : Boolean,
    val canLike : Boolean,
    val canPublish : Boolean,
)

data class Reposts (
    val count : Int,
    val userReposted : Boolean,
)

data class Views (
    val count : Int,
)

data class Donut (
    val isDonut : Boolean,
    val paidDuration : Int,
    val placeholder : Any,
    val canPublishFreeCopy : Boolean,
    val editMode : String,
)
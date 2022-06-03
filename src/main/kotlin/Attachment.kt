open class Attachment ( val  type: String )
data class VideoAttachment ( val video :Video ) : Attachment ( type = "video")
data class Video (
    val id: Long,
    val ownerId : Long,
    val title: String,
    val description : String
        )

data class AudioAttachment (val audio :Audio ) : Attachment (type = "audio")
data class Audio (
    val id: Long,
    val ownerId : Long,
    val title: String,
    val artist : String
)

data class DocAttachment (val doc :Doc ) : Attachment (type = "doc")
data class Doc (
    val id: Long,
    val ownerId : Long,
    val title: String,
    val size : Int
)

data class PhotoAttachment (val photo :Photo ) : Attachment (type = "photo")
data class Photo (
    val id: Long,
    val ownerId : Long,
    val albumId: Int,
    val text : String
)

data class LinkAttachment (val link :Link ) : Attachment (type = "link")
data class Link (
    val url: String,
    val title : String,
    val description : String
)
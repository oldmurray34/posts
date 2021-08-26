package attachment

class GifAttachment(override val type: String = "gif", val gif: Gif) : Attachment {
}
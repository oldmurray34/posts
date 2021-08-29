package attachment

class ArticleAttachment(override val type: String = "article", val article: Article) : Attachment {
}
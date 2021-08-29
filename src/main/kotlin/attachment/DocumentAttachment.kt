package attachment

class DocumentAttachment(override val type: String = "document", val document: Document) : Attachment {
}
package attachment

abstract class Attachment (
    type: ObjAttachment
        ) {
    var attachments = emptyArray<ObjAttachment>()
    var type: ObjAttachment = type
        set (value) {
            field = value
            attachments += field
        }
}
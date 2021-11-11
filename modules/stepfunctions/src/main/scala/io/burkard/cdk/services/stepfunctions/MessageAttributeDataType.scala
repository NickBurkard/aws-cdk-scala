package io.burkard.cdk.services.stepfunctions

sealed abstract class MessageAttributeDataType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType)
  extends Product
    with Serializable

object MessageAttributeDataType {
  implicit def toAws(value: MessageAttributeDataType): software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType =
    Option(value).map(_.underlying).orNull

  case object String
    extends MessageAttributeDataType(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING)

  case object StringArray
    extends MessageAttributeDataType(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING_ARRAY)

  case object Number
    extends MessageAttributeDataType(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.NUMBER)

  case object Binary
    extends MessageAttributeDataType(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.BINARY)
}

package io.burkard.cdk.services.dynamodb

sealed abstract class AttributeType(val underlying: software.amazon.awscdk.services.dynamodb.AttributeType)
  extends Product
    with Serializable

object AttributeType {
  implicit def toAws(value: AttributeType): software.amazon.awscdk.services.dynamodb.AttributeType =
    Option(value).map(_.underlying).orNull

  case object Binary
    extends AttributeType(software.amazon.awscdk.services.dynamodb.AttributeType.BINARY)

  case object Number
    extends AttributeType(software.amazon.awscdk.services.dynamodb.AttributeType.NUMBER)

  case object String
    extends AttributeType(software.amazon.awscdk.services.dynamodb.AttributeType.STRING)
}

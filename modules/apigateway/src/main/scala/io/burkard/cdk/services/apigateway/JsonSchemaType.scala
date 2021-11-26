package io.burkard.cdk.services.apigateway

sealed abstract class JsonSchemaType(val underlying: software.amazon.awscdk.services.apigateway.JsonSchemaType)
  extends Product
    with Serializable

object JsonSchemaType {
  implicit def toAws(value: JsonSchemaType): software.amazon.awscdk.services.apigateway.JsonSchemaType =
    Option(value).map(_.underlying).orNull

  case object Array
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.ARRAY)

  case object Boolean
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.BOOLEAN)

  case object Integer
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.INTEGER)

  case object Null
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.NULL)

  case object Number
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.NUMBER)

  case object Object
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.OBJECT)

  case object String
    extends JsonSchemaType(software.amazon.awscdk.services.apigateway.JsonSchemaType.STRING)
}

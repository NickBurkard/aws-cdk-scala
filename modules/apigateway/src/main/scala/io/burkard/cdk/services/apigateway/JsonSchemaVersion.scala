package io.burkard.cdk.services.apigateway


sealed abstract class JsonSchemaVersion(val underlying: software.amazon.awscdk.services.apigateway.JsonSchemaVersion)
  extends Product
    with Serializable


object JsonSchemaVersion {
  implicit def toAws(value: JsonSchemaVersion): software.amazon.awscdk.services.apigateway.JsonSchemaVersion =
    Option(value).map(_.underlying).orNull

  case object Draft4
    extends JsonSchemaVersion(software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT4)

  case object Draft7
    extends JsonSchemaVersion(software.amazon.awscdk.services.apigateway.JsonSchemaVersion.DRAFT7)
}

package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeySchemaProperty {

  def apply(
    keyType: Option[String] = None,
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder)
      .keyType(keyType.orNull)
      .attributeName(attributeName.orNull)
      .build()
}

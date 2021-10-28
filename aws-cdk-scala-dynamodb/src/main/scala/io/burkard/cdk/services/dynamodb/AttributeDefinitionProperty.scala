package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttributeDefinitionProperty {

  def apply(
    attributeName: Option[String] = None,
    attributeType: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.AttributeDefinitionProperty.Builder)
      .attributeName(attributeName.orNull)
      .attributeType(attributeType.orNull)
      .build()
}

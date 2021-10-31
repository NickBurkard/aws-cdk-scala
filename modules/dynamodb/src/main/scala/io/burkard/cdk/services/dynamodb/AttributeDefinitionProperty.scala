package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributeDefinitionProperty {

  def apply(
    attributeName: Option[String] = None,
    attributeType: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder)
      .attributeName(attributeName.orNull)
      .attributeType(attributeType.orNull)
      .build()
}

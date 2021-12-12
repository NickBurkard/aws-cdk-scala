package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributeDefinitionProperty {

  def apply(
    attributeName: String,
    attributeType: String
  ): software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder)
      .attributeName(attributeName)
      .attributeType(attributeType)
      .build()
}

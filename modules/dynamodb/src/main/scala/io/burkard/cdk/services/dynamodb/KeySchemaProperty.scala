package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeySchemaProperty {

  def apply(
    keyType: String,
    attributeName: String
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.Builder)
      .keyType(keyType)
      .attributeName(attributeName)
      .build()
}

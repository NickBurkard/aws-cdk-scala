package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaOptions {

  def apply(
    partitionKey: software.amazon.awscdk.services.dynamodb.Attribute,
    sortKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None
  ): software.amazon.awscdk.services.dynamodb.SchemaOptions =
    (new software.amazon.awscdk.services.dynamodb.SchemaOptions.Builder)
      .partitionKey(partitionKey)
      .sortKey(sortKey.orNull)
      .build()
}

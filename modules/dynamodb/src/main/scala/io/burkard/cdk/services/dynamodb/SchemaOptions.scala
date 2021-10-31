package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaOptions {

  def apply(
    sortKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    partitionKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None
  ): software.amazon.awscdk.services.dynamodb.SchemaOptions =
    (new software.amazon.awscdk.services.dynamodb.SchemaOptions.Builder)
      .sortKey(sortKey.orNull)
      .partitionKey(partitionKey.orNull)
      .build()
}

package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SSESpecificationProperty {

  def apply(
    sseEnabled: Boolean,
    sseType: Option[String] = None,
    kmsMasterKeyId: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder)
      .sseEnabled(sseEnabled)
      .sseType(sseType.orNull)
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .build()
}

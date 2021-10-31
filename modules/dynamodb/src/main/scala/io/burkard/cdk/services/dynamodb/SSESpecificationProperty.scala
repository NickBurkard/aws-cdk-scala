package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SSESpecificationProperty {

  def apply(
    sseType: Option[String] = None,
    kmsMasterKeyId: Option[String] = None,
    sseEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder)
      .sseType(sseType.orNull)
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .sseEnabled(sseEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

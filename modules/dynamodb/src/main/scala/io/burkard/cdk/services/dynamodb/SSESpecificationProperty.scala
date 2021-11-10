package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SSESpecificationProperty {

  def apply(
    sseType: Option[String] = None,
    sseEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.Builder)
      .sseType(sseType.orNull)
      .sseEnabled(sseEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

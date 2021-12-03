package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SSESpecificationProperty {

  def apply(
    sseEnabled: Boolean,
    sseType: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty.Builder)
      .sseEnabled(sseEnabled)
      .sseType(sseType.orNull)
      .build()
}

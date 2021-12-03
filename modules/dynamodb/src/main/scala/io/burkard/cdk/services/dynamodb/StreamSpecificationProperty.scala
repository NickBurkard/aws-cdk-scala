package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamSpecificationProperty {

  def apply(
    streamViewType: String
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.Builder)
      .streamViewType(streamViewType)
      .build()
}

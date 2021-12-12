package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamSpecificationProperty {

  def apply(
    streamViewType: String
  ): software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder)
      .streamViewType(streamViewType)
      .build()
}

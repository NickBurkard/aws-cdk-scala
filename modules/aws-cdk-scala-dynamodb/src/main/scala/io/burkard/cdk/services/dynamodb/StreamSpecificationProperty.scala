package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamSpecificationProperty {

  def apply(
    streamViewType: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty.Builder)
      .streamViewType(streamViewType.orNull)
      .build()
}

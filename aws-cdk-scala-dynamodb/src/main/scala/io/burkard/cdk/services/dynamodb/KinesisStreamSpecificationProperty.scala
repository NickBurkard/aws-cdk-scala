package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisStreamSpecificationProperty {

  def apply(
    streamArn: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.Builder)
      .streamArn(streamArn.orNull)
      .build()
}

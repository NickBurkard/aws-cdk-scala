package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisStreamSpecificationProperty {

  def apply(
    streamArn: String
  ): software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.Builder)
      .streamArn(streamArn)
      .build()
}

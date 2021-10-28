package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationProperty {

  def apply(
    format: Option[String] = None,
    prefix: Option[String] = None,
    bucketArn: Option[String] = None,
    bucketAccountId: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder)
      .format(format.orNull)
      .prefix(prefix.orNull)
      .bucketArn(bucketArn.orNull)
      .bucketAccountId(bucketAccountId.orNull)
      .build()
}

package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationProperty {

  def apply(
    format: String,
    bucketArn: String,
    prefix: Option[String] = None,
    bucketAccountId: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder)
      .format(format)
      .bucketArn(bucketArn)
      .prefix(prefix.orNull)
      .bucketAccountId(bucketAccountId.orNull)
      .build()
}

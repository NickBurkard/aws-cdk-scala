package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccountLevelProperty {

  def apply(
    bucketLevel: software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty,
    activityMetrics: Option[software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.Builder)
      .bucketLevel(bucketLevel)
      .activityMetrics(activityMetrics.orNull)
      .build()
}

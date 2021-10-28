package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccountLevelProperty {

  def apply(
    activityMetrics: Option[software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty] = None,
    bucketLevel: Option[software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.Builder)
      .activityMetrics(activityMetrics.orNull)
      .bucketLevel(bucketLevel.orNull)
      .build()
}

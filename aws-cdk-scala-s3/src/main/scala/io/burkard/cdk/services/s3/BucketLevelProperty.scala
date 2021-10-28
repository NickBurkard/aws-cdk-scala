package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketLevelProperty {

  def apply(
    activityMetrics: Option[software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty] = None,
    prefixLevel: Option[software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty.Builder)
      .activityMetrics(activityMetrics.orNull)
      .prefixLevel(prefixLevel.orNull)
      .build()
}

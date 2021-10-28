package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrefixLevelProperty {

  def apply(
    storageMetrics: Option[software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.Builder)
      .storageMetrics(storageMetrics.orNull)
      .build()
}

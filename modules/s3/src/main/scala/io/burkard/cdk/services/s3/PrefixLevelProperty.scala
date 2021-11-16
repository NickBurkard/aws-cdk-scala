package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrefixLevelProperty {

  def apply(
    storageMetrics: software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty
  ): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.Builder)
      .storageMetrics(storageMetrics)
      .build()
}

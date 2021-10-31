package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManifestFileLocationProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .build()
}

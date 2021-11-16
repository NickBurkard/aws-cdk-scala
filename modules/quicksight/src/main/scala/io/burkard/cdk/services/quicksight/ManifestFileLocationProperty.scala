package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManifestFileLocationProperty {

  def apply(
    key: String,
    bucket: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.Builder)
      .key(key)
      .bucket(bucket)
      .build()
}

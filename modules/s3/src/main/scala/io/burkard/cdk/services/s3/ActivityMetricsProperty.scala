package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActivityMetricsProperty {

  def apply(
    isEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty.Builder)
      .isEnabled(isEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

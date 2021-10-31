package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccelerateConfigurationProperty {

  def apply(
    accelerationStatus: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder)
      .accelerationStatus(accelerationStatus.orNull)
      .build()
}

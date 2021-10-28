package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccelerateConfigurationProperty {

  def apply(
    accelerationStatus: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder)
      .accelerationStatus(accelerationStatus.orNull)
      .build()
}

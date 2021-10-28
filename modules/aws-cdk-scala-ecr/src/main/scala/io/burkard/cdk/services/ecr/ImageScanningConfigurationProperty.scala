package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageScanningConfigurationProperty {

  def apply(
    scanOnPush: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty =
    (new software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty.Builder)
      .scanOnPush(scanOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

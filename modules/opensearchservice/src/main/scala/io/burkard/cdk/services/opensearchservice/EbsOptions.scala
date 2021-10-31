package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsOptions {

  def apply(
    enabled: Option[Boolean] = None,
    volumeType: Option[software.amazon.awscdk.services.ec2.EbsDeviceVolumeType] = None,
    iops: Option[Number] = None,
    volumeSize: Option[Number] = None
  ): software.amazon.awscdk.services.opensearchservice.EbsOptions =
    (new software.amazon.awscdk.services.opensearchservice.EbsOptions.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumeType(volumeType.orNull)
      .iops(iops.orNull)
      .volumeSize(volumeSize.orNull)
      .build()
}

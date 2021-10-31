package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeConfigurationProperty {

  def apply(
    size: Option[Number] = None,
    raidLevel: Option[Number] = None,
    iops: Option[Number] = None,
    volumeType: Option[String] = None,
    numberOfDisks: Option[Number] = None,
    mountPoint: Option[String] = None,
    encrypted: Option[Boolean] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder)
      .size(size.orNull)
      .raidLevel(raidLevel.orNull)
      .iops(iops.orNull)
      .volumeType(volumeType.orNull)
      .numberOfDisks(numberOfDisks.orNull)
      .mountPoint(mountPoint.orNull)
      .encrypted(encrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

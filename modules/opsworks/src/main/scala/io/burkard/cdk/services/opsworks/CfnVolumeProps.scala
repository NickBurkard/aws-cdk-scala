package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVolumeProps {

  def apply(
    name: Option[String] = None,
    ec2VolumeId: Option[String] = None,
    mountPoint: Option[String] = None,
    stackId: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnVolumeProps =
    (new software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder)
      .name(name.orNull)
      .ec2VolumeId(ec2VolumeId.orNull)
      .mountPoint(mountPoint.orNull)
      .stackId(stackId.orNull)
      .build()
}

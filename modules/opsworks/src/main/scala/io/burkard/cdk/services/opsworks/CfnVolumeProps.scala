package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolumeProps {

  def apply(
    ec2VolumeId: String,
    stackId: String,
    name: Option[String] = None,
    mountPoint: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnVolumeProps =
    (new software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder)
      .ec2VolumeId(ec2VolumeId)
      .stackId(stackId)
      .name(name.orNull)
      .mountPoint(mountPoint.orNull)
      .build()
}

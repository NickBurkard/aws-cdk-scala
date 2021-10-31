package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolume {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    ec2VolumeId: Option[String] = None,
    mountPoint: Option[String] = None,
    stackId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnVolume =
    software.amazon.awscdk.services.opsworks.CfnVolume.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .ec2VolumeId(ec2VolumeId.orNull)
      .mountPoint(mountPoint.orNull)
      .stackId(stackId.orNull)
      .build()
}

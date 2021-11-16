package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolume {

  def apply(
    internalResourceId: String,
    ec2VolumeId: String,
    stackId: String,
    name: Option[String] = None,
    mountPoint: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnVolume =
    software.amazon.awscdk.services.opsworks.CfnVolume.Builder
      .create(stackCtx, internalResourceId)
      .ec2VolumeId(ec2VolumeId)
      .stackId(stackId)
      .name(name.orNull)
      .mountPoint(mountPoint.orNull)
      .build()
}

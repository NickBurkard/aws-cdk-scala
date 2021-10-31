package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolumeAttachment {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    volumeId: Option[String] = None,
    device: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVolumeAttachment =
    software.amazon.awscdk.services.ec2.CfnVolumeAttachment.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .volumeId(volumeId.orNull)
      .device(device.orNull)
      .build()
}

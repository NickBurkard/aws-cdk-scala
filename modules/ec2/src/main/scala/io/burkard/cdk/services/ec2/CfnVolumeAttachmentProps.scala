package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVolumeAttachmentProps {

  def apply(
    instanceId: String,
    volumeId: String,
    device: String
  ): software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.Builder)
      .instanceId(instanceId)
      .volumeId(volumeId)
      .device(device)
      .build()
}

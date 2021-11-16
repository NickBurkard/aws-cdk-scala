package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfaceAttachment {

  def apply(
    internalResourceId: String,
    instanceId: String,
    deviceIndex: String,
    networkInterfaceId: String,
    deleteOnTermination: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment =
    software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId)
      .deviceIndex(deviceIndex)
      .networkInterfaceId(networkInterfaceId)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

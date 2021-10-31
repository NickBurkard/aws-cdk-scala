package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfaceAttachment {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    deviceIndex: Option[String] = None,
    deleteOnTermination: Option[Boolean] = None,
    networkInterfaceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment =
    software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .deviceIndex(deviceIndex.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}

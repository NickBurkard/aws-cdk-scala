package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNode {

  def apply(
    internalResourceId: String,
    networkId: Option[String] = None,
    nodeConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty] = None,
    memberId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.managedblockchain.CfnNode =
    software.amazon.awscdk.services.managedblockchain.CfnNode.Builder
      .create(stackCtx, internalResourceId)
      .networkId(networkId.orNull)
      .nodeConfiguration(nodeConfiguration.orNull)
      .memberId(memberId.orNull)
      .build()
}

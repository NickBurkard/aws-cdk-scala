package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNode {

  def apply(
    internalResourceId: String,
    networkId: String,
    nodeConfiguration: software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty,
    memberId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.managedblockchain.CfnNode =
    software.amazon.awscdk.services.managedblockchain.CfnNode.Builder
      .create(stackCtx, internalResourceId)
      .networkId(networkId)
      .nodeConfiguration(nodeConfiguration)
      .memberId(memberId.orNull)
      .build()
}

package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkFabricConfigurationProperty {

  def apply(
    edition: String
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty.Builder)
      .edition(edition)
      .build()
}

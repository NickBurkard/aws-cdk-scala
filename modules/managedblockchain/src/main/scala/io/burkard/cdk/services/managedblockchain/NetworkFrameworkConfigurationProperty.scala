package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkFrameworkConfigurationProperty {

  def apply(
    networkFabricConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFabricConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty.Builder)
      .networkFabricConfiguration(networkFabricConfiguration.orNull)
      .build()
}

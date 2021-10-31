package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemberFrameworkConfigurationProperty {

  def apply(
    memberFabricConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty.Builder)
      .memberFabricConfiguration(memberFabricConfiguration.orNull)
      .build()
}

package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemberConfigurationProperty {

  def apply(
    name: String,
    description: Option[String] = None,
    memberFrameworkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.Builder)
      .name(name)
      .description(description.orNull)
      .memberFrameworkConfiguration(memberFrameworkConfiguration.orNull)
      .build()
}

package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateConfigurationProperty {

  def apply(
    accountId: Option[String] = None,
    launchTemplateId: Option[String] = None,
    setDefaultVersion: Option[Boolean] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder)
      .accountId(accountId.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .setDefaultVersion(setDefaultVersion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

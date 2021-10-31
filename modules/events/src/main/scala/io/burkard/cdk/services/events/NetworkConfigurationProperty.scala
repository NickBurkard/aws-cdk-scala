package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigurationProperty {

  def apply(
    awsVpcConfiguration: Option[software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty] = None
  ): software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty.Builder)
      .awsVpcConfiguration(awsVpcConfiguration.orNull)
      .build()
}

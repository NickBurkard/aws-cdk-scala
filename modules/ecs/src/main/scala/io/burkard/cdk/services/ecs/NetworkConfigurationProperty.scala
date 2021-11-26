package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigurationProperty {

  def apply(
    awsVpcConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.Builder)
      .awsVpcConfiguration(awsVpcConfiguration.orNull)
      .build()
}

package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigurationProperty {

  def apply(
    awsvpcConfiguration: Option[software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty] = None
  ): software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder)
      .awsvpcConfiguration(awsvpcConfiguration.orNull)
      .build()
}

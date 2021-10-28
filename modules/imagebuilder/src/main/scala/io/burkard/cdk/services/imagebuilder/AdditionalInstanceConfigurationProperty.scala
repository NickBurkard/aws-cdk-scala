package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdditionalInstanceConfigurationProperty {

  def apply(
    userDataOverride: Option[String] = None,
    systemsManagerAgent: Option[software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder)
      .userDataOverride(userDataOverride.orNull)
      .systemsManagerAgent(systemsManagerAgent.orNull)
      .build()
}

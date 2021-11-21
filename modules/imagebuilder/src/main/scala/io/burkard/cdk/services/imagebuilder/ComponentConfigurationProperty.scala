package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComponentConfigurationProperty {

  def apply(
    componentArn: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty.Builder)
      .componentArn(componentArn.orNull)
      .build()
}

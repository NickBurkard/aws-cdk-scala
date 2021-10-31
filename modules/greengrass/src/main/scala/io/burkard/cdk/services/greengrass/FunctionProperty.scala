package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionProperty {

  def apply(
    id: Option[String] = None,
    functionConfiguration: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionConfigurationProperty] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.FunctionProperty.Builder)
      .id(id.orNull)
      .functionConfiguration(functionConfiguration.orNull)
      .functionArn(functionArn.orNull)
      .build()
}

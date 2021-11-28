package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionProperty {

  def apply(
    id: String,
    functionConfiguration: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty,
    functionArn: String
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.Builder)
      .id(id)
      .functionConfiguration(functionConfiguration)
      .functionArn(functionArn)
      .build()
}

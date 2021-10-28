package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionProperty {

  def apply(
    id: Option[String] = None,
    functionConfiguration: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionConfigurationProperty] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.FunctionProperty.Builder)
      .id(id.orNull)
      .functionConfiguration(functionConfiguration.orNull)
      .functionArn(functionArn.orNull)
      .build()
}

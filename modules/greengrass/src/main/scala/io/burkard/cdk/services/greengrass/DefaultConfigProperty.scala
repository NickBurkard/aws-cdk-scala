package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DefaultConfigProperty {

  def apply(
    execution: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder)
      .execution(execution.orNull)
      .build()
}

package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultConfigProperty {

  def apply(
    execution: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder)
      .execution(execution)
      .build()
}

package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultConfigProperty {

  def apply(
    execution: software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.DefaultConfigProperty.Builder)
      .execution(execution)
      .build()
}

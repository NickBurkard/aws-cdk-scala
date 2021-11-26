package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecutionProperty {

  def apply(
    isolationMode: Option[String] = None,
    runAs: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.RunAsProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinition.ExecutionProperty.Builder)
      .isolationMode(isolationMode.orNull)
      .runAs(runAs.orNull)
      .build()
}

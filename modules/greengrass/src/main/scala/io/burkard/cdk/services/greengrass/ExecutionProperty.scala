package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecutionProperty {

  def apply(
    isolationMode: Option[String] = None,
    runAs: Option[software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.RunAsProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ExecutionProperty.Builder)
      .isolationMode(isolationMode.orNull)
      .runAs(runAs.orNull)
      .build()
}

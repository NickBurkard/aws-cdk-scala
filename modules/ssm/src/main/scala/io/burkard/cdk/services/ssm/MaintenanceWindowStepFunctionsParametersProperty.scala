package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaintenanceWindowStepFunctionsParametersProperty {

  def apply(
    name: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder)
      .name(name.orNull)
      .input(input.orNull)
      .build()
}

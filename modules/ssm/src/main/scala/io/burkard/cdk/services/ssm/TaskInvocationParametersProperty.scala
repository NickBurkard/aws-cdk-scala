package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskInvocationParametersProperty {

  def apply(
    maintenanceWindowRunCommandParameters: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty] = None,
    maintenanceWindowLambdaParameters: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty] = None,
    maintenanceWindowAutomationParameters: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty] = None,
    maintenanceWindowStepFunctionsParameters: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder)
      .maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters.orNull)
      .maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters.orNull)
      .maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters.orNull)
      .maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters.orNull)
      .build()
}

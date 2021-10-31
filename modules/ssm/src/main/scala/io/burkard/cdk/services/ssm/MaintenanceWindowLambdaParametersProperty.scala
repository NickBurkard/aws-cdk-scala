package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaintenanceWindowLambdaParametersProperty {

  def apply(
    qualifier: Option[String] = None,
    payload: Option[String] = None,
    clientContext: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder)
      .qualifier(qualifier.orNull)
      .payload(payload.orNull)
      .clientContext(clientContext.orNull)
      .build()
}

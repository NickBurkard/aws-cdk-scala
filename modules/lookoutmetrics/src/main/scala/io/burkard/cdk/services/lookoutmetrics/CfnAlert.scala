package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlert {

  def apply(
    internalResourceId: String,
    alertSensitivityThreshold: Option[Number] = None,
    alertName: Option[String] = None,
    anomalyDetectorArn: Option[String] = None,
    alertDescription: Option[String] = None,
    action: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutmetrics.CfnAlert =
    software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder
      .create(stackCtx, internalResourceId)
      .alertSensitivityThreshold(alertSensitivityThreshold.orNull)
      .alertName(alertName.orNull)
      .anomalyDetectorArn(anomalyDetectorArn.orNull)
      .alertDescription(alertDescription.orNull)
      .action(action.orNull)
      .build()
}

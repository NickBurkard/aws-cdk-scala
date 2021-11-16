package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlertProps {

  def apply(
    alertSensitivityThreshold: Number,
    anomalyDetectorArn: String,
    action: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty,
    alertName: Option[String] = None,
    alertDescription: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.Builder)
      .alertSensitivityThreshold(alertSensitivityThreshold)
      .anomalyDetectorArn(anomalyDetectorArn)
      .action(action)
      .alertName(alertName.orNull)
      .alertDescription(alertDescription.orNull)
      .build()
}

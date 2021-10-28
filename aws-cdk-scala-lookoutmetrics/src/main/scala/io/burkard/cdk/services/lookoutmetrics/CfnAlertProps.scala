package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAlertProps {

  def apply(
    alertSensitivityThreshold: Option[Number] = None,
    alertName: Option[String] = None,
    anomalyDetectorArn: Option[String] = None,
    alertDescription: Option[String] = None,
    action: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.Builder)
      .alertSensitivityThreshold(alertSensitivityThreshold.orNull)
      .alertName(alertName.orNull)
      .anomalyDetectorArn(anomalyDetectorArn.orNull)
      .alertDescription(alertDescription.orNull)
      .action(action.orNull)
      .build()
}

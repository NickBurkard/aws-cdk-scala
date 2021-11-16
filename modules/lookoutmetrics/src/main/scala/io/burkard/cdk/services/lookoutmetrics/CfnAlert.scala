package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlert {

  def apply(
    internalResourceId: String,
    alertSensitivityThreshold: Number,
    anomalyDetectorArn: String,
    action: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty,
    alertName: Option[String] = None,
    alertDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutmetrics.CfnAlert =
    software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder
      .create(stackCtx, internalResourceId)
      .alertSensitivityThreshold(alertSensitivityThreshold)
      .anomalyDetectorArn(anomalyDetectorArn)
      .action(action)
      .alertName(alertName.orNull)
      .alertDescription(alertDescription.orNull)
      .build()
}

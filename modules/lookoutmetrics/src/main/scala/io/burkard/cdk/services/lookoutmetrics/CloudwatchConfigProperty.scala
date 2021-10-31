package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudwatchConfigProperty {

  def apply(
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty.Builder)
      .roleArn(roleArn.orNull)
      .build()
}

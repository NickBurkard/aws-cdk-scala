package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AppFlowConfigProperty {

  def apply(
    flowName: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty.Builder)
      .flowName(flowName.orNull)
      .roleArn(roleArn.orNull)
      .build()
}

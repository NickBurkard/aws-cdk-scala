package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublishFindingToSnsParamsProperty {

  def apply(
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.Builder)
      .topicArn(topicArn.orNull)
      .build()
}

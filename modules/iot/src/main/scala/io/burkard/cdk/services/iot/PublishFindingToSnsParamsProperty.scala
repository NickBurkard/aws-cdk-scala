package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishFindingToSnsParamsProperty {

  def apply(
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.Builder)
      .topicArn(topicArn.orNull)
      .build()
}

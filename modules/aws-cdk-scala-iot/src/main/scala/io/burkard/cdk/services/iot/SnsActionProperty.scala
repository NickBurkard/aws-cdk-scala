package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnsActionProperty {

  def apply(
    targetArn: Option[String] = None,
    messageFormat: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder)
      .targetArn(targetArn.orNull)
      .messageFormat(messageFormat.orNull)
      .roleArn(roleArn.orNull)
      .build()
}

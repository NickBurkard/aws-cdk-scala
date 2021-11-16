package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsActionProperty {

  def apply(
    targetArn: String,
    roleArn: String,
    messageFormat: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder)
      .targetArn(targetArn)
      .roleArn(roleArn)
      .messageFormat(messageFormat.orNull)
      .build()
}

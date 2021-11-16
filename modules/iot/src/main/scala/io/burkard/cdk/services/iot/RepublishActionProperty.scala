package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepublishActionProperty {

  def apply(
    roleArn: String,
    topic: String,
    qos: Option[Number] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder)
      .roleArn(roleArn)
      .topic(topic)
      .qos(qos.orNull)
      .build()
}

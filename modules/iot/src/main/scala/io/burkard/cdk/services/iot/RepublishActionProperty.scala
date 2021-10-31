package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepublishActionProperty {

  def apply(
    roleArn: Option[String] = None,
    topic: Option[String] = None,
    qos: Option[Number] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder)
      .roleArn(roleArn.orNull)
      .topic(topic.orNull)
      .qos(qos.orNull)
      .build()
}

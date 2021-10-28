package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenSearchActionProperty {

  def apply(
    id: Option[String] = None,
    roleArn: Option[String] = None,
    endpoint: Option[String] = None,
    `type`: Option[String] = None,
    index: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.Builder)
      .id(id.orNull)
      .roleArn(roleArn.orNull)
      .endpoint(endpoint.orNull)
      .`type`(`type`.orNull)
      .index(index.orNull)
      .build()
}
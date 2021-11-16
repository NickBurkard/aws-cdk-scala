package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenSearchActionProperty {

  def apply(
    id: String,
    roleArn: String,
    endpoint: String,
    `type`: String,
    index: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.Builder)
      .id(id)
      .roleArn(roleArn)
      .endpoint(endpoint)
      .`type`(`type`)
      .index(index)
      .build()
}

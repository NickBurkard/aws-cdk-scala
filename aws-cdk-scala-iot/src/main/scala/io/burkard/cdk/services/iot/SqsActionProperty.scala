package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsActionProperty {

  def apply(
    queueUrl: Option[String] = None,
    useBase64: Option[Boolean] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder)
      .queueUrl(queueUrl.orNull)
      .useBase64(useBase64.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleArn(roleArn.orNull)
      .build()
}

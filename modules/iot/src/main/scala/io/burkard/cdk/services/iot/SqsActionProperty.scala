package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqsActionProperty {

  def apply(
    queueUrl: String,
    roleArn: String,
    useBase64: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder)
      .queueUrl(queueUrl)
      .roleArn(roleArn)
      .useBase64(useBase64.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

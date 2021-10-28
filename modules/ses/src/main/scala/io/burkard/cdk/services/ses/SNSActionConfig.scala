package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SNSActionConfig {

  def apply(
    topicArn: Option[String] = None,
    encoding: Option[String] = None
  ): software.amazon.awscdk.services.ses.SNSActionConfig =
    (new software.amazon.awscdk.services.ses.SNSActionConfig.Builder)
      .topicArn(topicArn.orNull)
      .encoding(encoding.orNull)
      .build()
}

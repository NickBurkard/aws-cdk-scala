package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StopActionConfig {

  def apply(
    scope: Option[String] = None,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.StopActionConfig =
    (new software.amazon.awscdk.services.ses.StopActionConfig.Builder)
      .scope(scope.orNull)
      .topicArn(topicArn.orNull)
      .build()
}

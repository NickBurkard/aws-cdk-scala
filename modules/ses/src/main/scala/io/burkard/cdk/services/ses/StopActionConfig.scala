package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StopActionConfig {

  def apply(
    scope: String,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.StopActionConfig =
    (new software.amazon.awscdk.services.ses.StopActionConfig.Builder)
      .scope(scope)
      .topicArn(topicArn.orNull)
      .build()
}

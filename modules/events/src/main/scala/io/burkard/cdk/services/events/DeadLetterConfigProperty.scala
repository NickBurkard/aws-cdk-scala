package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeadLetterConfigProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty =
    (new software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty.Builder)
      .arn(arn.orNull)
      .build()
}

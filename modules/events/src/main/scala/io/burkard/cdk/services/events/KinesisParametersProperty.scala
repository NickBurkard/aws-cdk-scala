package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisParametersProperty {

  def apply(
    partitionKeyPath: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder)
      .partitionKeyPath(partitionKeyPath.orNull)
      .build()
}

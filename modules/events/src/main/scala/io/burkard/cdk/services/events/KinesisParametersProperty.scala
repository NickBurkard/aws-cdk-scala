package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisParametersProperty {

  def apply(
    partitionKeyPath: String
  ): software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder)
      .partitionKeyPath(partitionKeyPath)
      .build()
}

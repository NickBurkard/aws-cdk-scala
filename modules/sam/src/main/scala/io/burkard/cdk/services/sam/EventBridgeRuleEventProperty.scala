package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventBridgeRuleEventProperty {

  def apply(
    pattern: Option[AnyRef] = None,
    eventBusName: Option[String] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty.Builder)
      .pattern(pattern.orNull)
      .eventBusName(eventBusName.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .build()
}

package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventBridgeRuleEventProperty {

  def apply(
    pattern: Option[AnyRef] = None,
    eventBusName: Option[String] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty.Builder)
      .pattern(pattern.orNull)
      .eventBusName(eventBusName.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .build()
}

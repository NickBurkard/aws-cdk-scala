package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchEventEventProperty {

  def apply(
    pattern: AnyRef,
    eventBusName: Option[String] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty.Builder)
      .pattern(pattern)
      .eventBusName(eventBusName.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .build()
}

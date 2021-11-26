package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchEventEventProperty {

  def apply(
    pattern: AnyRef,
    inputPath: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder)
      .pattern(pattern)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .build()
}

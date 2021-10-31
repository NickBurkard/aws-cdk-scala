package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchEventEventProperty {

  def apply(
    pattern: Option[AnyRef] = None,
    inputPath: Option[String] = None,
    input: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder)
      .pattern(pattern.orNull)
      .inputPath(inputPath.orNull)
      .input(input.orNull)
      .build()
}

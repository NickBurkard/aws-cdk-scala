package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsEventProperty {

  def apply(
    filterPattern: Option[String] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.Builder)
      .filterPattern(filterPattern.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}

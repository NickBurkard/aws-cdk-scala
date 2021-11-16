package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsEventProperty {

  def apply(
    filterPattern: String,
    logGroupName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.Builder)
      .filterPattern(filterPattern)
      .logGroupName(logGroupName)
      .build()
}

package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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

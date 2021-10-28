package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogProperty {

  def apply(
    logType: Option[String] = None,
    patternSet: Option[String] = None,
    encoding: Option[String] = None,
    logGroupName: Option[String] = None,
    logPath: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.Builder)
      .logType(logType.orNull)
      .patternSet(patternSet.orNull)
      .encoding(encoding.orNull)
      .logGroupName(logGroupName.orNull)
      .logPath(logPath.orNull)
      .build()
}

package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplyCloudFormationInitOptions {

  def apply(
    includeRole: Option[Boolean] = None,
    printLog: Option[Boolean] = None,
    includeUrl: Option[Boolean] = None,
    configSets: Option[List[String]] = None,
    embedFingerprint: Option[Boolean] = None,
    ignoreFailures: Option[Boolean] = None
  ): software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions =
    (new software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions.Builder)
      .includeRole(includeRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .printLog(printLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeUrl(includeUrl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .configSets(configSets.map(_.asJava).orNull)
      .embedFingerprint(embedFingerprint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignoreFailures(ignoreFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttachInitOptions {

  def apply(
    instanceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    signalResource: Option[software.amazon.awscdk.CfnResource] = None,
    includeRole: Option[Boolean] = None,
    printLog: Option[Boolean] = None,
    platform: Option[software.amazon.awscdk.services.ec2.OperatingSystemType] = None,
    includeUrl: Option[Boolean] = None,
    configSets: Option[List[String]] = None,
    embedFingerprint: Option[Boolean] = None,
    ignoreFailures: Option[Boolean] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.AttachInitOptions =
    (new software.amazon.awscdk.services.ec2.AttachInitOptions.Builder)
      .instanceRole(instanceRole.orNull)
      .signalResource(signalResource.orNull)
      .includeRole(includeRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .printLog(printLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .platform(platform.orNull)
      .includeUrl(includeUrl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .configSets(configSets.map(_.asJava).orNull)
      .embedFingerprint(embedFingerprint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignoreFailures(ignoreFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userData(userData.orNull)
      .build()
}

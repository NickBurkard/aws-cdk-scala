package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttachInitOptions {

  def apply(
    instanceRole: software.amazon.awscdk.services.iam.IRole,
    platform: software.amazon.awscdk.services.ec2.OperatingSystemType,
    userData: software.amazon.awscdk.services.ec2.UserData,
    signalResource: Option[software.amazon.awscdk.CfnResource] = None,
    includeRole: Option[Boolean] = None,
    printLog: Option[Boolean] = None,
    includeUrl: Option[Boolean] = None,
    configSets: Option[List[String]] = None,
    embedFingerprint: Option[Boolean] = None,
    ignoreFailures: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.AttachInitOptions =
    (new software.amazon.awscdk.services.ec2.AttachInitOptions.Builder)
      .instanceRole(instanceRole)
      .platform(platform)
      .userData(userData)
      .signalResource(signalResource.orNull)
      .includeRole(includeRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .printLog(printLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeUrl(includeUrl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .configSets(configSets.map(_.asJava).orNull)
      .embedFingerprint(embedFingerprint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignoreFailures(ignoreFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

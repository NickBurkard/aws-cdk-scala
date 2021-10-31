package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMountTarget {

  def apply(
    internalResourceId: String,
    subnetId: Option[String] = None,
    ipAddress: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    fileSystemId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.CfnMountTarget =
    software.amazon.awscdk.services.efs.CfnMountTarget.Builder
      .create(stackCtx, internalResourceId)
      .subnetId(subnetId.orNull)
      .ipAddress(ipAddress.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}

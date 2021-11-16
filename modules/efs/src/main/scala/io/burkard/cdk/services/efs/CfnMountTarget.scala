package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMountTarget {

  def apply(
    internalResourceId: String,
    subnetId: String,
    securityGroups: List[String],
    fileSystemId: String,
    ipAddress: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.CfnMountTarget =
    software.amazon.awscdk.services.efs.CfnMountTarget.Builder
      .create(stackCtx, internalResourceId)
      .subnetId(subnetId)
      .securityGroups(securityGroups.asJava)
      .fileSystemId(fileSystemId)
      .ipAddress(ipAddress.orNull)
      .build()
}

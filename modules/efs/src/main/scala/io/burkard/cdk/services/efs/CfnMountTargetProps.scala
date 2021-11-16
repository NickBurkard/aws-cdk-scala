package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMountTargetProps {

  def apply(
    subnetId: String,
    securityGroups: List[String],
    fileSystemId: String,
    ipAddress: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnMountTargetProps =
    (new software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder)
      .subnetId(subnetId)
      .securityGroups(securityGroups.asJava)
      .fileSystemId(fileSystemId)
      .ipAddress(ipAddress.orNull)
      .build()
}

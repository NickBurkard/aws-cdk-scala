package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMountTargetProps {

  def apply(
    subnetId: Option[String] = None,
    ipAddress: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    fileSystemId: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnMountTargetProps =
    (new software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder)
      .subnetId(subnetId.orNull)
      .ipAddress(ipAddress.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}

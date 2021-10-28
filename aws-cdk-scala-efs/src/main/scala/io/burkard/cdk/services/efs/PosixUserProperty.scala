package io.burkard.cdk.services.efs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PosixUserProperty {

  def apply(
    gid: Option[String] = None,
    secondaryGids: Option[List[String]] = None,
    uid: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.Builder)
      .gid(gid.orNull)
      .secondaryGids(secondaryGids.map(_.asJava).orNull)
      .uid(uid.orNull)
      .build()
}

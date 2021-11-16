package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PosixUserProperty {

  def apply(
    gid: String,
    uid: String,
    secondaryGids: Option[List[String]] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.Builder)
      .gid(gid)
      .uid(uid)
      .secondaryGids(secondaryGids.map(_.asJava).orNull)
      .build()
}

package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PosixProfileProperty {

  def apply(
    gid: Number,
    uid: Number,
    secondaryGids: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty =
    (new software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.Builder)
      .gid(gid)
      .uid(uid)
      .secondaryGids(secondaryGids.map(_.asJava).orNull)
      .build()
}

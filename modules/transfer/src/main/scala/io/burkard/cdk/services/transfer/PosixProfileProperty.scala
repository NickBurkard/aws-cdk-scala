package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PosixProfileProperty {

  def apply(
    gid: Option[Number] = None,
    secondaryGids: Option[List[_ <: Number]] = None,
    uid: Option[Number] = None
  ): software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty =
    (new software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.Builder)
      .gid(gid.orNull)
      .secondaryGids(secondaryGids.map(_.asJava).orNull)
      .uid(uid.orNull)
      .build()
}

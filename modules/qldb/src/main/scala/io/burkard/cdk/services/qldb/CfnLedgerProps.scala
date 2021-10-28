package io.burkard.cdk.services.qldb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLedgerProps {

  def apply(
    name: Option[String] = None,
    kmsKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deletionProtection: Option[Boolean] = None,
    permissionsMode: Option[String] = None
  ): software.amazon.awscdk.services.qldb.CfnLedgerProps =
    (new software.amazon.awscdk.services.qldb.CfnLedgerProps.Builder)
      .name(name.orNull)
      .kmsKey(kmsKey.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .permissionsMode(permissionsMode.orNull)
      .build()
}

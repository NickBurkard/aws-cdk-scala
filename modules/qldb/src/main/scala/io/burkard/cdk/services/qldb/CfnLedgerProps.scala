package io.burkard.cdk.services.qldb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLedgerProps {

  def apply(
    permissionsMode: String,
    name: Option[String] = None,
    kmsKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deletionProtection: Option[Boolean] = None
  ): software.amazon.awscdk.services.qldb.CfnLedgerProps =
    (new software.amazon.awscdk.services.qldb.CfnLedgerProps.Builder)
      .permissionsMode(permissionsMode)
      .name(name.orNull)
      .kmsKey(kmsKey.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

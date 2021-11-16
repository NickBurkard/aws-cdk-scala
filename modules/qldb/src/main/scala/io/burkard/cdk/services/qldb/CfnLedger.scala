package io.burkard.cdk.services.qldb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLedger {

  def apply(
    internalResourceId: String,
    permissionsMode: String,
    name: Option[String] = None,
    kmsKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deletionProtection: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.qldb.CfnLedger =
    software.amazon.awscdk.services.qldb.CfnLedger.Builder
      .create(stackCtx, internalResourceId)
      .permissionsMode(permissionsMode)
      .name(name.orNull)
      .kmsKey(kmsKey.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

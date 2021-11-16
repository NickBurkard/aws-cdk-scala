package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationSet {

  def apply(
    internalResourceId: String,
    regions: List[_],
    deletionProtected: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet =
    software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder
      .create(stackCtx, internalResourceId)
      .regions(regions.asJava)
      .deletionProtected(deletionProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

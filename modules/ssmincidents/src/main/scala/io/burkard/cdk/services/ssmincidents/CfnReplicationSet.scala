package io.burkard.cdk.services.ssmincidents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReplicationSet {

  def apply(
    internalResourceId: String,
    regions: Option[List[_]] = None,
    deletionProtected: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmincidents.CfnReplicationSet =
    software.amazon.awscdk.services.ssmincidents.CfnReplicationSet.Builder
      .create(stackCtx, internalResourceId)
      .regions(regions.map(_.asJava).orNull)
      .deletionProtected(deletionProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

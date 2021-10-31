package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationSetProps {

  def apply(
    regions: Option[List[_]] = None,
    deletionProtected: Option[Boolean] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps =
    (new software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps.Builder)
      .regions(regions.map(_.asJava).orNull)
      .deletionProtected(deletionProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

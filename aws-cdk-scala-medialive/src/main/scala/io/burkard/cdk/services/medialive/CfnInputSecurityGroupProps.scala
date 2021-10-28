package io.burkard.cdk.services.medialive

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInputSecurityGroupProps {

  def apply(
    whitelistRules: Option[List[_]] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps =
    (new software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps.Builder)
      .whitelistRules(whitelistRules.map(_.asJava).orNull)
      .tags(tags.orNull)
      .build()
}

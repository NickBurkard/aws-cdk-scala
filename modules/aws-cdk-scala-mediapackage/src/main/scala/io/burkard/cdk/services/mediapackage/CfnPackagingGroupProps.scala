package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPackagingGroupProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty] = None,
    authorization: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .egressAccessLogs(egressAccessLogs.orNull)
      .authorization(authorization.orNull)
      .id(id.orNull)
      .build()
}

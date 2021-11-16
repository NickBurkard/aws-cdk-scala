package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackagingGroupProps {

  def apply(
    id: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty] = None,
    authorization: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.Builder)
      .id(id)
      .tags(tags.map(_.asJava).orNull)
      .egressAccessLogs(egressAccessLogs.orNull)
      .authorization(authorization.orNull)
      .build()
}

package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPackagingGroup {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty] = None,
    authorization: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty] = None,
    id: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup =
    software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .egressAccessLogs(egressAccessLogs.orNull)
      .authorization(authorization.orNull)
      .id(id.orNull)
      .build()
}

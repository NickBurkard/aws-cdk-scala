package io.burkard.cdk.services.panorama

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationInstance {

  def apply(
    internalResourceId: String,
    manifestPayload: software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty,
    defaultRuntimeContextDevice: String,
    statusFilter: Option[String] = None,
    name: Option[String] = None,
    runtimeRoleArn: Option[String] = None,
    manifestOverridesPayload: Option[software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty] = None,
    applicationInstanceIdToReplace: Option[String] = None,
    deviceId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.panorama.CfnApplicationInstance =
    software.amazon.awscdk.services.panorama.CfnApplicationInstance.Builder
      .create(stackCtx, internalResourceId)
      .manifestPayload(manifestPayload)
      .defaultRuntimeContextDevice(defaultRuntimeContextDevice)
      .statusFilter(statusFilter.orNull)
      .name(name.orNull)
      .runtimeRoleArn(runtimeRoleArn.orNull)
      .manifestOverridesPayload(manifestOverridesPayload.orNull)
      .applicationInstanceIdToReplace(applicationInstanceIdToReplace.orNull)
      .deviceId(deviceId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

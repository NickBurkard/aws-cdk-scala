package io.burkard.cdk.services.panorama

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationInstanceProps {

  def apply(
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
  ): software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps =
    (new software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps.Builder)
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

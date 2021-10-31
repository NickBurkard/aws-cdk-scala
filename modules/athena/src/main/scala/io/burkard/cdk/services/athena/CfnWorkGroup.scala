package io.burkard.cdk.services.athena

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    state: Option[String] = None,
    workGroupConfiguration: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty] = None,
    workGroupConfigurationUpdates: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty] = None,
    recursiveDeleteOption: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.athena.CfnWorkGroup =
    software.amazon.awscdk.services.athena.CfnWorkGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .state(state.orNull)
      .workGroupConfiguration(workGroupConfiguration.orNull)
      .workGroupConfigurationUpdates(workGroupConfigurationUpdates.orNull)
      .recursiveDeleteOption(recursiveDeleteOption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
